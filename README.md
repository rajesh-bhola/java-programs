# Star-Patterns

<details> 
  <summary> Pattern_1
    
    * * * * 
    * * * * 
    * * * * 
    * * * *

  </summary>

```java
package com.rajesh.app;

public class Pattern_1 {

    public static void main(String[] args) {

        System.out.println("1st way");
        printPattern1stWay(4);
        System.out.println();

        System.out.println("2nd way");
        printPattern2ndWay(4);
        System.out.println();

        System.out.println("3rd way");
        printPattern3rdWay(4);
        System.out.println();
    }

    public static void printPattern1stWay(int num) {
        for (int row = 0; row <= num; row++) {
            for (int col = 0; col <= num; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern2ndWay(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern3rdWay(int num) {
        for (int row = 1; row <= num; row++) {
            StringBuilder pattern = new StringBuilder();
            for (int col = 1; col <= num; col++) {
                pattern.append("* ");
            }
            System.out.println(pattern.toString());
        }
    }
}
```

</details>

<br>

<details> 
  <summary> Pattern_2
    
    * 
    * * 
    * * * 
    * * * * 
    * * * * * 

  </summary>

```java
package com.rajesh.app;

public class Pattern_2 {

	public static void main(String[] args) {

		System.out.println("1st way");
		printPattern1stway(5);
		System.out.println();
		
		System.out.println("2nd way");
		printPattern2ndWay(5);
		System.out.println();
		
		System.out.println("3rd way");
		printPattern3rdWay(5);
		System.out.println();
		
		System.out.println("4th way");
		printPattern4thWay(5);
		System.out.println();
		
		System.out.println("5th way");
		printPattern5thWay(5);
		System.out.println();

	}

	public static void printPattern1stway(int num) {
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void printPattern2ndWay(int num) {
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void printPattern3rdWay(int num) {
		String pattern = "";
		for (int row = 1; row <= num; row++) {
			pattern += "* ";
			System.out.println(pattern);
		}
	}

	public static void printPattern4thWay(int num) {
		for (int row = 1; row <= num; row++) {
			System.out.println("* ".repeat(row));
		}
	}

	public static void printPattern5thWay(int num) {
		for (int row = 1; row <= num; row++) {
			StringBuilder pattern = new StringBuilder();
			for (int col = 1; col <= row; col++) {
				pattern.append("* ");
			}
			System.out.println(pattern.toString());
		}
	}
}
```

</details>

<br>

<details> 
  <summary> Pattern_3
    
    * * * * * 
    * * * * 
    * * * 
    * * 
    *

  </summary>

```java
package com.rajesh.app;

public class Pattern_3 {

	public static void main(String[] args) {

		System.out.println("1st way");
		printPattern1stWay(5);
		System.out.println();

		System.out.println("2nd way");
		printPattern2ndWay(5);
		System.out.println();

		System.out.println("3rd way");
		printPattern3rdWay(5);
		System.out.println();

		System.out.println("4th way");
		printPattern4thWay(5);
		System.out.println();

	}

	public static void printPattern1stWay(int num) {
		for (int row = 1; row <= num; row++) {
			for (int col = num; col >= row; col--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void printPattern2ndWay(int num) {
		for (int row = num; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void printPattern3rdWay(int num) {
		for (int row = num; row >= 1; row--) {
			System.out.println("* ".repeat(row));
		}
	}

	public static void printPattern4thWay(int num) {
		for (int row = 1; row <= num; row++) {
			StringBuilder pattern = new StringBuilder();
			for (int col = num; col >= row; col--) {
				pattern.append("* ");
			}
			System.out.println(pattern.toString());
		}
	}
}
```

</details>

<br>

<details> 
  <summary> Pattern_4
<pre>
         *
       * *
     * * *
   * * * *
 * * * * *
</pre>

  </summary>

```java
package com.rajesh.app;

public class Pattern_4 {

	public static void main(String[] args) {

		printPattern1stWay(5);
		printPattern2ndWay(5);
		printPattern3rdWay(5);
	}

	private static void printPattern1stWay(int num) {

		for (int row = 1; row <= num; row++) {
			for (int col = row; col <= num; col++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void printPattern2ndWay(int num) {
		for (int row = 0; row < num; row++) {
			for (int col = 0; col < num; col++) {
				if (col >= num - row - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private static void printPattern3rdWay(int num) {
		for (int row = 1; row <= num; row++) {
			for (int col = num; col >= 1; col--) {
				if (row >= col) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
```

</details>

<br>

<details> 
  <summary> Pattern_5
<pre>
	* * * * *
	  * * * *
	    * * *
	      * *
	        *
</pre>

  </summary>

```java
package com.rajesh.app;

public class Pattern_5 {

	public static void main(String[] args) {

		printPattern1stWay(5);
		printPattern2ndWay(5);

	}

	private static void printPattern1stWay(int num) {

		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(" ");
			}
			for (int col = row; col <= num; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void printPattern2ndWay(int num) {
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (col < row) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
```

</details>