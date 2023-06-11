for i in range(1, 10):
    for j in range(1, 10):
        print("if ((line.substring(line.lastIndexOf('m') + 2, line.lastIndexOf('t')-1).equals('" +
              i + "')) && (line.substring(line.lastIndexOf('o') + 1).equals('" + j + "'))) {for (int i = 0; i < amountToMove; i++) {stack" + j + ".push(stack" + i + ".pop()); } }")
