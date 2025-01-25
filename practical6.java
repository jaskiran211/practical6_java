class Practical6 {
    public static void main(String args[]) {
        Practical6 p = new Practical6();
        p.displayPattern1(3);
        p.displayPattern2(3);
        p.displayPattern3(3);
    }

    static void displayPattern1(int size) {
        for (int line = 0; line < size; line++) {
            for (int space = 0; space < size - line - 1; space++) {
                System.out.print(" ");
            }
            for (int plus = 0; plus < 2 * line + 1; plus++) {
                System.out.print("+");
            }
            System.out.print("\n");
        }
        for (int line = size - 2; line >= 0; line--) {
            for (int space = 0; space < size - line - 1; space++) {
                System.out.print(" ");
            }
            for (int chars = 0; chars < 2 * line + 1; chars++) {
                System.out.print("+");
            }
            System.out.print("\n");
        }
    }

    static void displayPattern2(int size) {
        for (int line = 0; line < size; line++) {
            for (int space = 0; space < size - line - 1; space++) {
                System.out.print(" ");
            }
            for (int chars = 0; chars < 2 * line + 1; chars++) {
                if (chars % 2 == 0) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        for (int line = size - 2; line >= 0; line--) {
            for (int space = 0; space < size - line - 1; space++) {
                System.out.print(" ");
            }
            for (int chars = 0; chars < 2 * line + 1; chars++) {
                if (chars % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    static void displayPattern3(int size) {
        for (int line = 0; line < size; line++) {
            for (int space = 0; space < size - line - 1; space++) {
                System.out.print(" ");
            }
            for (int chars = 0; chars < 2 * line + 1; chars++) {
                if (line % 2 == 0) {
                    if (chars % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("+");
                    }
                } else {
                    if (chars % 2 == 0) {
                        System.out.print("+");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.print("\n");
        }
        for (int line = size - 1; line >= 0; line--) {
            for (int space = 0; space < size - line - 1; space++) {
                System.out.print(" ");
            }
            for (int chars = 0; chars < 2 * line + 1; chars++) {
                if (line % 2 == 0) {
                    if (chars % 2 == 0) {
                        System.out.print("+");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    if (chars % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("+");
                    }
                }
            }
            System.out.print("\n");
        }
    }
}

