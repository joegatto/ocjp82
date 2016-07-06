package br.com.gatto.chapter9.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Exercise 10 
 * Explanation: C, E. The REPLACE_EXISTING flag was not
 * provided, so if the target exists, it will throw an exception at runtime and
 * A is incorrect. Next, the NOFOLLOW_LINKS option means that if the source is a
 * symbolic link, the link itself and not the target will be copied at runtime,
 * so B is also incorrect. The option ATOMIC_MOVE means that any process
 * monitoring the file system will not see an incomplete file during the move,
 * so C is correct. D is incorrect, since you could rename a file not to have an
 * extension. Note that in this example, if monkey.txt is a file, then the
 * resulting /animals would be a file, not a directory. Likewise, if the source
 * is a directory, the result would also be a directory. E is correct, because
 * moving always preserves the metadata even if the COPY_ATTRIBUTES flag is not
 * set.
 */
public class Exercise10 {
	public static void main(String[] args) throws IOException {
		Files.move(Paths.get("monkey.txt"), Paths.get("/animals"), StandardCopyOption.ATOMIC_MOVE,
				LinkOption.NOFOLLOW_LINKS);
	}
}
