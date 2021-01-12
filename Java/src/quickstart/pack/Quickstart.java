package quickstart.pack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.StandardOpenOption;
import java.security.InvalidKeyException;

import org.w3c.dom.Document;

import com.microsoft.azure.storage.CloudStorageAccount;
import com.microsoft.azure.storage.StorageException;
import com.microsoft.azure.storage.blob.BlobInputStream;
import com.microsoft.azure.storage.blob.BlockBlobURL;
import com.microsoft.azure.storage.blob.CloudBlob;
import com.microsoft.azure.storage.blob.CloudBlobClient;
import com.microsoft.azure.storage.blob.CloudBlobContainer;
import com.microsoft.azure.storage.blob.ContainerURL;
import com.microsoft.azure.storage.blob.ListBlobsOptions;
import com.microsoft.azure.storage.blob.PipelineOptions;
import com.microsoft.azure.storage.blob.ServiceURL;
import com.microsoft.azure.storage.blob.SharedKeyCredentials;
import com.microsoft.azure.storage.blob.StorageURL;
import com.microsoft.azure.storage.blob.TransferManager;
import com.microsoft.azure.storage.blob.models.BlobItem;
import com.microsoft.azure.storage.blob.models.ContainerListBlobFlatSegmentResponse;
import com.microsoft.rest.v2.RestException;

import io.reactivex.Single;

public class Quickstart {
	/*static File createTempFile() throws IOException {

		// Here we are creating a temporary file to use for download and upload to Blob
		// storage
		File sampleFile = null;
		sampleFile = File.createTempFile("sampleFile", ".txt");
		System.out.println(">> Creating a sample file at: " + sampleFile.toString());
		Writer output = new BufferedWriter(new FileWriter(sampleFile));
		output.write("Hello Azure!");
		output.close();

		return sampleFile;
	}*/

	static void listBlobs(ContainerURL containerURL) {
		// Each ContainerURL.listBlobsFlatSegment call return up to maxResults
		// (maxResults=10 passed into ListBlobOptions below).
		// To list all Blobs, we are creating a helper static method called
		// listAllBlobs,
		// and calling it after the initial listBlobsFlatSegment call
		ListBlobsOptions options = new ListBlobsOptions();
		options.withMaxResults(10);

		containerURL.listBlobsFlatSegment(null, options, null)
				.flatMap(containerListBlobFlatSegmentResponse -> listAllBlobs(containerURL,
						containerListBlobFlatSegmentResponse))
				.subscribe(response -> {
					System.out.println("Completed list blobs request.");
					System.out.println(response.statusCode());
				});
	}

	private static Single<ContainerListBlobFlatSegmentResponse> listAllBlobs(ContainerURL url,
			ContainerListBlobFlatSegmentResponse response) throws IOException {
		// Process the blobs returned in this result segment (if the segment is empty,
		// blobs() will be null.
		if (response.body().segment() != null) {
			for (BlobItem b : response.body().segment().blobItems()) {
				String output = b.name();
				/*try {
				CloudStorageAccount cloudStorageAccount = CloudStorageAccount.parse("DefaultEndpointsProtocol=https;AccountName=famstestsa;AccountKey=7+q7N3EIBaDOpfcwSfSA2b+a1G7CXjJWytm8t0LrZIWbtUnWkczlia3xJutACBd7WenC3uTycGsvWVXT2b+6YQ==");
	            CloudBlobClient cloudBlobClient = cloudStorageAccount.createCloudBlobClient();
	            CloudBlobContainer cloudBlobContainer = cloudBlobClient.getContainerReference("famstest");
	            CloudBlob cloudBlob = cloudBlobContainer.getBlockBlobReference(output);
	            
					BlobInputStream byteData = cloudBlob.openInputStream();
				} catch (StorageException | URISyntaxException | InvalidKeyException e) {
					e.printStackTrace();
				}*/
	            
				/*InputStream in = new FileInputStream();
				byte[] bytes = toByteArrayFromInputStream(in);*/
				/*byte arr[] = b.toString().getBytes("UTF8");
				 InputStream targetStream = new ByteArrayInputStream(arr);*/
				/*if (b.snapshot() != null) {
					output += ", Snapshot: " + b.snapshot();
				}*/
				System.out.println(output);
			}
		} else {
			System.out.println("There are no more blobs to list off.");
		}

		// If there is not another segment, return this response as the final response.
		if (response.body().nextMarker() == null) {
			return Single.just(response);
		} else {
			/*
			 * IMPORTANT: ListBlobsFlatSegment returns the start of the next segment; you
			 * MUST use this to get the next segment (after processing the current result
			 * segment
			 */

			String nextMarker = response.body().nextMarker();

			/*
			 * The presence of the marker indicates that there are more blobs to list, so we
			 * make another call to listBlobsFlatSegment and pass the result through this
			 * helper function.
			 */

			return url.listBlobsFlatSegment(nextMarker, new ListBlobsOptions().withMaxResults(10), null).flatMap(
					containersListBlobFlatSegmentResponse -> listAllBlobs(url, containersListBlobFlatSegmentResponse));
		}
	}


	private static byte[] toByteArrayFromInputStream(InputStream is) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int reads = is.read();
		while (reads != -1) {
			baos.write(reads);
			reads = is.read();
		}
		return baos.toByteArray();
	}
	
	static void getBlob(BlockBlobURL blobURL, File sourceFile) throws IOException {
		AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(sourceFile.toPath(),
				StandardOpenOption.CREATE, StandardOpenOption.WRITE);

		TransferManager.downloadBlobToFile(fileChannel, blobURL, null, null).subscribe(response -> {
			System.out.println("Completed download request.");
			System.out.println("The blob was downloaded to " + sourceFile.getAbsolutePath());
		});
	}

	public static void main(String[] args) throws java.lang.Exception {
		ContainerURL containerURL;

		// Creating a sample file to use in the sample
		File sampleFile = null;

		try {
			//sampleFile = createTempFile();

			File downloadedFile = File.createTempFile("downloadedFile", ".txt");

			// Retrieve the credentials and initialize SharedKeyCredentials
			String accountName = System.getenv("AZURE_STORAGE_ACCOUNT");
			String accountKey = System.getenv("AZURE_STORAGE_ACCESS_KEY");

			// Create a ServiceURL to call the Blob service. We will also use this to
			// construct the ContainerURL
			SharedKeyCredentials creds = new SharedKeyCredentials(accountName, accountKey);
			// We are using a default pipeline here, you can learn more about it at
			// https://github.com/Azure/azure-storage-java/wiki/Azure-Storage-Java-V10-Overview
			// final ServiceURL serviceURL = new ServiceURL(new URL("https://" + accountName
			// + ".blob.core.windows.net"), StorageURL.createPipeline(creds, new
			// PipelineOptions()));
			final ServiceURL serviceURL = new ServiceURL(new URL("https://famstestsa.blob.core.windows.net/"),
					StorageURL.createPipeline(creds, new PipelineOptions()));
			// Let's create a container using a blocking call to Azure Storage
			// If container exists, we'll catch and continue
			containerURL = serviceURL.createContainerURL("famstest");

			/*
			 * try { ContainerCreateResponse response = containerURL.create(null, null,
			 * null).blockingGet(); System.out.println("Container Create Response was " +
			 * response.statusCode()); } catch (RestException e){ if (e instanceof
			 * RestException && ((RestException)e).response().statusCode() != 409) { throw
			 * e; } else {
			 * System.out.println("quickstart container already exists, resuming..."); } }
			 */

			// Create a BlockBlobURL to run operations on Blobs
			// final BlockBlobURL blobURL =
			// containerURL.createBlockBlobURL("SampleBlob.txt");

			// Listening for commands from the console
			System.out.println("Enter a command");
			System.out.println("(L)istBlobs | (E)xitSample");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			while (true) {

				System.out.println("# Enter a command : ");
				String input = reader.readLine();

				switch (input) {
				case "L":
					System.out.println("Listing blobs in the container: " + containerURL);
					listBlobs(containerURL);
					break;
				case "E":
					System.out.println("Cleaning up the sample and exiting!");
					containerURL.delete(null, null).blockingGet();
					downloadedFile.delete();
					System.exit(0);
					break;
				default:
					break;
				}
			}
		} catch (InvalidKeyException e) {
			System.out.println("Invalid Storage account name/key provided");
		} catch (MalformedURLException e) {
			System.out.println("Invalid URI provided");
		} catch (RestException e) {
			System.out.println("Service error returned: " + e.response().statusCode());
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
}
