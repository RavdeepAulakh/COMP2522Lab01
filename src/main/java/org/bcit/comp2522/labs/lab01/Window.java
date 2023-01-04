package org.bcit.comp2522.labs.lab01;

import processing.core.PApplet;

/**
 *
 * <p> the window class which draws a shape. </p>
 *
 * @version 1.0
 * @author Ravdeep Aulakh
 *
 */
public class Window extends PApplet {
  public void settings() {
    size(500, 500);
  }

  /**
   *
   * <p> method that draws a shape. </p>
   *
   */
  public void draw() {
    ellipse(mouseX, mouseY, 50, 50);
    square(100, 184, 100);
    ellipse(350, 184, 100, 120);
    circle(230, 250, 200);
    triangle(120, 180, 232, 80, 344, 180);
  }

  /**
   *
   * <p> method that changes the background color on mouse click. </p>
   *
   */
  public void mousePressed() {
    background(64);
  }

  /**
   *
   * <p> drives the program. </p>
   *
   * @param args unused
   */
  public static void main(String[] args) {
    String[] processingArgs = {"window"};
    Window window = new Window();
    PApplet.runSketch(processingArgs, window);
  }
}
