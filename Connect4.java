import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Connect4 {

    Graphics2D g;

    public void r6(){
                                circle2 c1 = new circle2();
                                c1.x = 10+140+6+140+6+140+6+140+140+140-28;
                                c1.y = 110;
                                boolean fass = true;
                                for(int i=5; i>=0 && fass; i--) {
                                    if(arr[6][5-i] != 1) {
                                        fass = false;
                                        arr[6][5-i] = 1;
                                        c1.y = 100+10+6+i*140;
                                    }
                                }
                                circle2s.add(c1);
                                g.setColor(Color.YELLOW);
                                g.fillRect(10, 90, 990, 890);
                                for(int i=0; i<7; i++) {
                                    for(int j=0; j<6; j++) {
                                        g.setColor(Color.BLACK);
                                        g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
                                    }
                                }
                                Thread t = new Thread() {
                                    public void run() {
                                        for(int i=110; i<c1.y; i++) {
                                            g.setColor(Color.YELLOW);
                                            g.fillRect(10, 90, 990, 890);
                                            for(int gg=0; gg<7; gg++) {
                                                for(int j=0; j<6; j++) {
                                                    g.setColor(Color.BLACK);
                                                    g.fillOval(10+gg*140+6, j*140+6+100, 120, 120);
                                                }
                                            }
                                            for(int k=0; k<circle1s.size(); k++) {
                                                g.setColor(circle1s.get(k).color);
                                                g.fillOval(circle1s.get(k).x, circle1s.get(k).y, 120, 120);
                                            }
                                            for(int k=0; k<circle2s.size(); k++) {
                                                g.setColor(circle2s.get(k).color);
                                                g.fillOval(circle2s.get(k).x, circle2s.get(k).y, 120, 120);
                                            }
                                            g.setColor(c1.color);
                                            g.drawOval(c1.x, i, 120, 120);
                                            try {
                                                Thread.sleep(4);
                                            } catch(Exception e) {}
                                        }
                                        g.setColor(Color.YELLOW);
                                        g.fillRect(10, 90, 990, 890);
                                        for(int i=0; i<7; i++) {
                                            for(int j=0; j<6; j++) {
                                                g.setColor(Color.BLACK);
                                                g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
                                            }
                                        }
                                        for(int i=0; i<circle2s.size(); i++) {
                                            g.setColor(circle2s.get(i).color);
                                            g.fillOval(circle2s.get(i).x, circle2s.get(i).y, 120, 120);
                                        }
                                        for(int i=0; i<circle1s.size(); i++) {
                                            g.setColor(circle1s.get(i).color);
                                            g.fillOval(circle1s.get(i).x, circle1s.get(i).y, 120, 120);
                                        }
                                    }
                                };
                                t.start();
                                turn = 0;
    }
    
    public void r5() {

        circle2 c1 = new circle2();
        c1.x = 10+140+6+140+6+140+6+140+6+140+6+10-28;
        c1.y = 110;
        boolean fass = true;
        for(int i=5; i>=0 && fass; i--) {
            if(arr[5][5-i] != 1) {
                fass = false;
                arr[5][5-i] = 1;
                c1.y = 100+10+6+i*140;
            }
        }
        circle2s.add(c1);
        g.setColor(Color.YELLOW);
        g.fillRect(10, 90, 990, 890);
        for(int i=0; i<7; i++) {
            for(int j=0; j<6; j++) {
                g.setColor(Color.BLACK);
                g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
            }
        }
        Thread t = new Thread() {
            public void run() {
                for(int i=110; i<c1.y; i++) {
                    g.setColor(Color.YELLOW);
                    g.fillRect(10, 90, 990, 890);
                    for(int gg=0; gg<7; gg++) {
                        for(int j=0; j<6; j++) {
                            g.setColor(Color.BLACK);
                            g.fillOval(10+gg*140+6, j*140+6+100, 120, 120);
                        }
                    }
                    for(int k=0; k<circle1s.size(); k++) {
                        g.setColor(circle1s.get(k).color);
                        g.fillOval(circle1s.get(k).x, circle1s.get(k).y, 120, 120);
                    }
                    for(int k=0; k<circle2s.size(); k++) {
                        g.setColor(circle2s.get(k).color);
                        g.fillOval(circle2s.get(k).x, circle2s.get(k).y, 120, 120);
                    }
                    g.setColor(c1.color);
                    g.drawOval(c1.x, i, 120, 120);
                    try {
                        Thread.sleep(4);
                    } catch(Exception e) {}
                }
                g.setColor(Color.YELLOW);
                g.fillRect(10, 90, 990, 890);
                for(int i=0; i<7; i++) {
                    for(int j=0; j<6; j++) {
                        g.setColor(Color.BLACK);
                        g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
                    }
                }
                for(int i=0; i<circle2s.size(); i++) {
                    g.setColor(circle2s.get(i).color);
                    g.fillOval(circle2s.get(i).x, circle2s.get(i).y, 120, 120);
                }
                for(int i=0; i<circle1s.size(); i++) {
                    g.setColor(circle1s.get(i).color);
                    g.fillOval(circle1s.get(i).x, circle1s.get(i).y, 120, 120);
                }
            }
        };
        t.start();
        turn = 0;
    }
    
    public void r4() {
        circle2 c1 = new circle2();
        c1.x = 10+140+6+140+6+140+6+140+6+10-28;
        c1.y = 110;
        boolean fass = true;
        for(int i=5; i>=0 && fass; i--) {
            if(arr[4][5-i] != 1) {
                fass = false;
                arr[4][5-i] = 1;
                c1.y = 100+10+6+i*140;
            }
        }
        circle2s.add(c1);
        g.setColor(Color.YELLOW);
        g.fillRect(10, 90, 990, 890);
        for(int i=0; i<7; i++) {
            for(int j=0; j<6; j++) {
                g.setColor(Color.BLACK);
                g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
            }
        }
        Thread t = new Thread() {
            public void run() {
                for(int i=110; i<c1.y; i++) {
                    g.setColor(Color.YELLOW);
                    g.fillRect(10, 90, 990, 890);
                    for(int gg=0; gg<7; gg++) {
                        for(int j=0; j<6; j++) {
                            g.setColor(Color.BLACK);
                            g.fillOval(10+gg*140+6, j*140+6+100, 120, 120);
                        }
                    }
                    for(int k=0; k<circle1s.size(); k++) {
                        g.setColor(circle1s.get(k).color);
                        g.fillOval(circle1s.get(k).x, circle1s.get(k).y, 120, 120);
                    }
                    for(int k=0; k<circle2s.size(); k++) {
                        g.setColor(circle2s.get(k).color);
                        g.fillOval(circle2s.get(k).x, circle2s.get(k).y, 120, 120);
                    }
                    g.setColor(c1.color);
                    g.drawOval(c1.x, i, 120, 120);
                    try {
                        Thread.sleep(4);
                    } catch(Exception e) {}
                }
                g.setColor(Color.YELLOW);
                g.fillRect(10, 90, 990, 890);
                for(int i=0; i<7; i++) {
                    for(int j=0; j<6; j++) {
                        g.setColor(Color.BLACK);
                        g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
                    }
                }
                for(int i=0; i<circle2s.size(); i++) {
                    g.setColor(circle2s.get(i).color);
                    g.fillOval(circle2s.get(i).x, circle2s.get(i).y, 120, 120);
                }
                for(int i=0; i<circle1s.size(); i++) {
                    g.setColor(circle1s.get(i).color);
                    g.fillOval(circle1s.get(i).x, circle1s.get(i).y, 120, 120);
                }
            }
        };
        t.start();
        turn = 0;
    }
    
    public void r3() {
        circle2 c1 = new circle2();
        c1.x = 10+140+6+140+6+140+6+10-28;
        c1.y = 110;
        boolean fass = true;
        for(int i=5; i>=0 && fass; i--) {
            if(arr[3][5-i] != 1) {
                fass = false;
                arr[3][5-i] = 1;
                c1.y = 100+10+6+i*140;
            }
        }
        circle2s.add(c1);
        g.setColor(Color.YELLOW);
        g.fillRect(10, 90, 990, 890);
        for(int i=0; i<7; i++) {
            for(int j=0; j<6; j++) {
                g.setColor(Color.BLACK);
                g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
            }
        }
        Thread t = new Thread() {
            public void run() {
                for(int i=110; i<c1.y; i++) {
                    g.setColor(Color.YELLOW);
                    g.fillRect(10, 90, 990, 890);
                    for(int gg=0; gg<7; gg++) {
                        for(int j=0; j<6; j++) {
                            g.setColor(Color.BLACK);
                            g.fillOval(10+gg*140+6, j*140+6+100, 120, 120);
                        }
                    }
                    for(int k=0; k<circle1s.size(); k++) {
                        g.setColor(circle1s.get(k).color);
                        g.fillOval(circle1s.get(k).x, circle1s.get(k).y, 120, 120);
                    }
                    for(int k=0; k<circle2s.size(); k++) {
                        g.setColor(circle2s.get(k).color);
                        g.fillOval(circle2s.get(k).x, circle2s.get(k).y, 120, 120);
                    }
                    g.setColor(c1.color);
                    g.drawOval(c1.x, i, 120, 120);
                    try {
                        Thread.sleep(4);
                    } catch(Exception e) {}
                }
                g.setColor(Color.YELLOW);
                g.fillRect(10, 90, 990, 890);
                for(int i=0; i<7; i++) {
                    for(int j=0; j<6; j++) {
                        g.setColor(Color.BLACK);
                        g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
                    }
                }
                for(int i=0; i<circle2s.size(); i++) {
                    g.setColor(circle2s.get(i).color);
                    g.fillOval(circle2s.get(i).x, circle2s.get(i).y, 120, 120);
                }
                for(int i=0; i<circle1s.size(); i++) {
                    g.setColor(circle1s.get(i).color);
                    g.fillOval(circle1s.get(i).x, circle1s.get(i).y, 120, 120);
                }
            }
        };
        t.start();
        turn = 0;
        
    }
    
    public void r2() {
        circle2 c1 = new circle2();
        c1.x = 20+10+140+6+140+6+10-28;
        c1.y = 110;
        boolean fass = true;
        for(int i=5; i>=0 && fass; i--) {
            if(arr[2][5-i] != 1) {
                fass = false;
                arr[2][5-i] = 1;
                c1.y = 100+10+6+i*140;
            }
        }
        circle2s.add(c1);
        g.setColor(Color.YELLOW);
        g.fillRect(10, 90, 990, 890);
        for(int i=0; i<7; i++) {
            for(int j=0; j<6; j++) {
                g.setColor(Color.BLACK);
                g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
            }
        }
        Thread t = new Thread() {
            public void run() {
                for(int i=110; i<c1.y; i++) {
                    g.setColor(Color.YELLOW);
                    g.fillRect(10, 90, 990, 890);
                    for(int gg=0; gg<7; gg++) {
                        for(int j=0; j<6; j++) {
                            g.setColor(Color.BLACK);
                            g.fillOval(10+gg*140+6, j*140+6+100, 120, 120);
                        }
                    }
                    for(int k=0; k<circle1s.size(); k++) {
                        g.setColor(circle1s.get(k).color);
                        g.fillOval(circle1s.get(k).x, circle1s.get(k).y, 120, 120);
                    }
                    for(int k=0; k<circle2s.size(); k++) {
                        g.setColor(circle2s.get(k).color);
                        g.fillOval(circle2s.get(k).x, circle2s.get(k).y, 120, 120);
                    }
                    g.setColor(c1.color);
                    g.drawOval(c1.x, i, 120, 120);
                    try {
                        Thread.sleep(4);
                    } catch(Exception e) {}
                }
                g.setColor(Color.YELLOW);
                g.fillRect(10, 90, 990, 890);
                for(int i=0; i<7; i++) {
                    for(int j=0; j<6; j++) {
                        g.setColor(Color.BLACK);
                        g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
                    }
                }
                for(int i=0; i<circle2s.size(); i++) {
                    g.setColor(circle2s.get(i).color);
                    g.fillOval(circle2s.get(i).x, circle2s.get(i).y, 120, 120);
                }
                for(int i=0; i<circle1s.size(); i++) {
                    g.setColor(circle1s.get(i).color);
                    g.fillOval(circle1s.get(i).x, circle1s.get(i).y, 120, 120);
                }
            }
        };
        t.start();
        turn = 0;
        
    }
    public void r1() {
        circle2 c1 = new circle2();
        c1.x = 20+10+140+6+10-8;
        c1.y = 110;
        boolean fass = true;
        for(int i=5; i>=0 && fass; i--) {
            if(arr[1][5-i] != 1) {
                fass = false;
                arr[1][5-i] = 1;
                c1.y = 100+10+6+i*140;
            }
        }
        circle2s.add(c1);
        g.setColor(Color.YELLOW);
        g.fillRect(10, 90, 990, 890);
        for(int i=0; i<7; i++) {
            for(int j=0; j<6; j++) {
                g.setColor(Color.BLACK);
                g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
            }
        }
        Thread t = new Thread() {
            public void run() {
                for(int i=110; i<c1.y; i++) {
                    g.setColor(Color.YELLOW);
                    g.fillRect(10, 90, 990, 890);
                    for(int gg=0; gg<7; gg++) {
                        for(int j=0; j<6; j++) {
                            g.setColor(Color.BLACK);
                            g.fillOval(10+gg*140+6, j*140+6+100, 120, 120);
                        }
                    }
                    for(int k=0; k<circle1s.size(); k++) {
                        g.setColor(circle1s.get(k).color);
                        g.fillOval(circle1s.get(k).x, circle1s.get(k).y, 120, 120);
                    }
                    for(int k=0; k<circle2s.size(); k++) {
                        g.setColor(circle2s.get(k).color);
                        g.fillOval(circle2s.get(k).x, circle2s.get(k).y, 120, 120);
                    }
                    g.setColor(c1.color);
                    g.drawOval(c1.x, i, 120, 120);
                    try {
                        Thread.sleep(4);
                    } catch(Exception e) {}
                }
                g.setColor(Color.YELLOW);
                g.fillRect(10, 90, 990, 890);
                for(int i=0; i<7; i++) {
                    for(int j=0; j<6; j++) {
                        g.setColor(Color.BLACK);
                        g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
                    }
                }
                for(int i=0; i<circle2s.size(); i++) {
                    g.setColor(circle2s.get(i).color);
                    g.fillOval(circle2s.get(i).x, circle2s.get(i).y, 120, 120);
                }
                for(int i=0; i<circle1s.size(); i++) {
                    g.setColor(circle1s.get(i).color);
                    g.fillOval(circle1s.get(i).x, circle1s.get(i).y, 120, 120);
                }
            }
        };
        t.start();
        turn = 0;
    }
    
    public void r0() {
        circle2 c1 = new circle2();
        c1.x = 20;
        c1.y = 110;
        boolean fass = true;
        for(int i=5; i>=0 && fass; i--) {
            if(arr[0][5-i] != 1) {
                fass = false;
                arr[0][5-i] = 1;
                c1.y = 100+10+6+i*140;
            }
        }
        circle2s.add(c1);
        g.setColor(Color.YELLOW);
        g.fillRect(10, 90, 990, 890);
        for(int i=0; i<7; i++) {
            for(int j=0; j<6; j++) {
                g.setColor(Color.BLACK);
                g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
            }
        }
        Thread t = new Thread() {
            public void run() {
                for(int i=110; i<c1.y; i++) {
                    g.setColor(Color.YELLOW);
                    g.fillRect(10, 90, 990, 890);
                    for(int gg=0; gg<7; gg++) {
                        for(int j=0; j<6; j++) {
                            g.setColor(Color.BLACK);
                            g.fillOval(10+gg*140+6, j*140+6+100, 120, 120);
                        }
                    }
                    for(int k=0; k<circle1s.size(); k++) {
                        g.setColor(circle1s.get(k).color);
                        g.fillOval(circle1s.get(k).x, circle1s.get(k).y, 120, 120);
                    }
                    for(int k=0; k<circle2s.size(); k++) {
                        g.setColor(circle2s.get(k).color);
                        g.fillOval(circle2s.get(k).x, circle2s.get(k).y, 120, 120);
                    }
                    g.setColor(c1.color);
                    g.drawOval(c1.x, i, 120, 120);
                    try {
                        Thread.sleep(4);
                    } catch(Exception e) {}
                }
                g.setColor(Color.YELLOW);
                g.fillRect(10, 90, 990, 890);
                for(int i=0; i<7; i++) {
                    for(int j=0; j<6; j++) {
                        g.setColor(Color.BLACK);
                        g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
                    }
                }
                for(int i=0; i<circle2s.size(); i++) {
                    g.setColor(circle2s.get(i).color);
                    g.fillOval(circle2s.get(i).x, circle2s.get(i).y, 120, 120);
                }
                for(int i=0; i<circle1s.size(); i++) {
                    g.setColor(circle1s.get(i).color);
                    g.fillOval(circle1s.get(i).x, circle1s.get(i).y, 120, 120);
                }
            }
        };
        t.start();
        turn = 0;
    }
    
    JFrame j = new JFrame("Connect4");
    JPanel p = new JPanel();
    circle1 circle1 = new circle1();
    circle2 circle2 = new circle2();
    ArrayList<circle1> circle1s = new ArrayList<>();
    ArrayList<circle2> circle2s = new ArrayList<>();
    int turn = 0;
    int arr[][] = new int[7][6];
    
    public Connect4() {
        for(int i=0; i<7; i++) {
            for(int j=0; j<6; j++) {
                arr[i][j] = 0;
            }
        }
        j.setLayout(null);
        p.setLayout(null);
        j.setBounds(0, 0, 1000, 1000);
        p.setBounds(j.getBounds());
        j.add(p);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
        Thread t1 = new Thread() {
            public void run () {
                while(true) {
                    Random r = new Random();
                    int v = r.nextInt(7);
                    if(turn == 1) {
                        if(v == 0) {
                            r0();
                        }
                        if(v == 1) {
                            r1();
                        }
                        if(v == 2) {
                            r2();
                        }
                        if(v == 3) {
                            r3();
                        }
                        if(v == 4) {
                            r4();
                        }
                        if(v == 5) {
                            r5();
                        }
                        if(v == 6) {
                            r6();
                        }
                        try {
                            Thread.sleep(3000);
                        } catch(Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        t1.start();
        g = (Graphics2D) p.getGraphics();
        Thread t2 = new Thread(new Thread(new Runnable() {
            @Override
            public void run() {
                g.setColor(Color.GRAY);
                g.fillRect(0, 0, 1000, 1000);
                g.setColor(Color.WHITE);
                g.drawString("PRESS", 10+10, 70);
                g.setColor(Color.WHITE);
                g.drawString("PRESS", 10+140+6+10, 70);
                g.setColor(Color.WHITE);
                g.drawString("PRESS", 10+140+6+140+6+10, 70);
                g.setColor(Color.WHITE);
                g.drawString("PRESS", 10+140+6+140+6+140+6+10, 70);
                g.setColor(Color.WHITE);
                g.drawString("PRESS", 10+140+6+140+6+140+6+140+6+10, 70);
                g.setColor(Color.WHITE);
                g.drawString("PRESS", 10+140+6+140+6+140+6+140+6+140+6+10, 70);
                g.setColor(Color.WHITE);
                g.drawString("PRESS", 10+140+6+140+6+140+6+140+6+140+6+140+6+10, 70);
                g.setColor(Color.YELLOW);
                g.fillRect(10, 90, 990, 890);
                for(int i=0; i<7; i++) {
                    for(int j=0; j<6; j++) {
                        g.setColor(Color.BLACK);
                        g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
                    }
                }
            }
        }));
        t2.start();
        j.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                if(e.getX() >= 20 && e.getX() <= 166 &&
                        e.getY() >= 70 && e.getY() <= 100) {
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            g.setColor(Color.GRAY);
                            g.fillRect(10+10, 40, 140, 33);
                            try {
                                Thread.sleep(1000);
                                g.setColor(Color.MAGENTA);
                                g.drawString("PRESS", 10+10, 70);
                            } catch(Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    thread.start();
                }
                if(e.getX() >= 20+10+140+6+10 && e.getX() <= 20+10+140+6+10+70 &&
                        e.getY() >= 70 && e.getY() <= 100) {
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            g.setColor(Color.GRAY);
                            g.fillRect(10+10+10+140+6+10, 40, 140, 33);
                            try {
                                Thread.sleep(1000);
                                g.setColor(Color.MAGENTA);
                                g.drawString("PRESS", 10+10+10+140+6+10, 70);
                            } catch(Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    thread.start();
                }
                if(e.getX() >= 20+10+140+6+140+6+10 && e.getX() <= 20+10+140+6+140+6+10+70 &&
                        e.getY() >= 70 && e.getY() <= 100) {
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            g.setColor(Color.GRAY);
                            g.fillRect(10+10+140+6+140+6+10, 40, 140, 33);
                            try {
                                Thread.sleep(1000);
                                g.setColor(Color.MAGENTA);
                                g.drawString("PRESS", 10+10+140+6+140+6+10, 70);
                            } catch(Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    thread.start();
                }
                if(e.getX() >= 10+140+6+140+6+140+6+10 && e.getX() <= 10+140+6+140+6+140+6+10+70 &&
                        e.getY() >= 70 && e.getY() <= 100) {
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            g.setColor(Color.GRAY);
                            g.fillRect(10+140+6+140+6+140+6+10, 40, 140, 33);
                            try {
                                Thread.sleep(1000);
                                g.setColor(Color.MAGENTA);
                                g.drawString("PRESS", 10+140+6+140+6+140+6+10, 70);
                            } catch(Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    thread.start();
                }
                if(e.getX() >= 10+140+6+140+6+140+6+140+6+10 && e.getX() <= 10+140+6+140+6+140+6+140+6+10+70 &&
                        e.getY() >= 70 && e.getY() <= 100) {
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            g.setColor(Color.GRAY);
                            g.fillRect(10+140+6+140+6+140+6+140+6+10, 40, 140, 33);
                            try {
                                Thread.sleep(1000);
                                g.setColor(Color.MAGENTA);
                                g.drawString("PRESS", 10+140+6+140+6+140+6+140+6+10, 70);
                            } catch(Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    thread.start();
                }
                if(e.getX() >= 10+140+6+140+6+140+6+140+6+140+6+10 && e.getX() <= 10+140+6+140+6+140+6+140+6+140+6+10+70 &&
                        e.getY() >= 70 && e.getY() <= 100) {
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            g.setColor(Color.GRAY);
                            g.fillRect(10+140+6+140+6+140+6+140+6+140+6+10, 40, 140, 33);
                            try {
                                Thread.sleep(1000);
                                g.setColor(Color.MAGENTA);
                                g.drawString("PRESS", 10+140+6+140+6+140+6+140+6+140+6+10, 70);
                            } catch(Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    thread.start();
                }
                if(e.getX() >= 10+140+6+140+6+140+6+140+6+140+6+140+6+10 && e.getX() <= 10+140+6+140+6+140+6+140+6+140+6+140+6+10+70 &&
                        e.getY() >= 70 && e.getY() <= 100) {
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            g.setColor(Color.GRAY);
                            g.fillRect(10+140+6+140+6+140+6+140+6+140+6+140+6+10, 40, 140, 33);
                            try {
                                Thread.sleep(1000);
                                g.setColor(Color.MAGENTA);
                                g.drawString("PRESS", 10+140+6+140+6+140+6+140+6+140+6+140+6+10, 70);
                            } catch(Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    thread.start();
                }
            }
        });
        j.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if(e.getX() >= 20 && e.getX() <= 166 &&
                        e.getY() >= 70 && e.getY() <= 100) {
                    Thread thread = new Thread() {
                        public void run() {
                            if(turn == 0) {
                                circle1 c1 = new circle1();
                                c1.x = 20;
                                c1.y = 110;
                                boolean fass = true;
                                for(int i=5; i>=0 && fass; i--) {
                                    if(arr[0][5-i] != 1) {
                                        fass = false;
                                        arr[0][5-i] = 1;
                                        c1.y = 100+10+6+i*140;
                                    }
                                }
                                circle1s.add(c1);
                                g.setColor(Color.YELLOW);
                                g.fillRect(10, 90, 990, 890);
                                for(int i=0; i<7; i++) {
                                    for(int j=0; j<6; j++) {
                                        g.setColor(Color.BLACK);
                                        g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
                                    }
                                }
                                Thread t = new Thread() {
                                    public void run() {
                                        for(int i=110; i<c1.y; i++) {
                                            g.setColor(Color.YELLOW);
                                            g.fillRect(10, 90, 990, 890);
                                            for(int gg=0; gg<7; gg++) {
                                                for(int j=0; j<6; j++) {
                                                    g.setColor(Color.BLACK);
                                                    g.fillOval(10+gg*140+6, j*140+6+100, 120, 120);
                                                }
                                            }
                                            for(int k=0; k<circle1s.size(); k++) {
                                                g.setColor(circle1s.get(k).color);
                                                g.fillOval(circle1s.get(k).x, circle1s.get(k).y, 120, 120);
                                            }
                                            for(int k=0; k<circle2s.size(); k++) {
                                                g.setColor(circle2s.get(k).color);
                                                g.fillOval(circle2s.get(k).x, circle2s.get(k).y, 120, 120);
                                            }
                                            g.setColor(c1.color);
                                            g.drawOval(c1.x, i, 120, 120);
                                            try {
                                                Thread.sleep(4);
                                            } catch(Exception e) {}
                                        }
                                        g.setColor(Color.YELLOW);
                                        g.fillRect(10, 90, 990, 890);
                                        for(int i=0; i<7; i++) {
                                            for(int j=0; j<6; j++) {
                                                g.setColor(Color.BLACK);
                                                g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
                                            }
                                        }
                                        for(int i=0; i<circle1s.size(); i++) {
                                            g.setColor(circle1s.get(i).color);
                                            g.fillOval(circle1s.get(i).x, circle1s.get(i).y, 120, 120);
                                        }
                                        for(int i=0; i<circle2s.size(); i++) {
                                            g.setColor(circle2s.get(i).color);
                                            g.fillOval(circle2s.get(i).x, circle2s.get(i).y, 120, 120);
                                        }
                                    }
                                };
                                t.start();
                                turn = 1;
                            }
                            else if(turn == 1) {
                                r0();
                            }
                        }
                    };
                    thread.start();
                }
                if(e.getX() >= 20+10+140+6+10 && e.getX() <= 20+10+140+6+10+70 &&
                        e.getY() >= 70 && e.getY() <= 100) {
                    Thread thread = new Thread() {
                        public void run() {
                            if(turn == 0) {
                                circle1 c1 = new circle1();
                                c1.x = 20+10+140+6+10-8;
                                c1.y = 110;
                                boolean fass = true;
                                for(int i=5; i>=0 && fass; i--) {
                                    if(arr[1][5-i] != 1) {
                                        fass = false;
                                        arr[1][5-i] = 1;
                                        c1.y = 100+10+6+i*140;
                                    }
                                }
                                circle1s.add(c1);
                                g.setColor(Color.YELLOW);
                                g.fillRect(10, 90, 990, 890);
                                for(int i=0; i<7; i++) {
                                    for(int j=0; j<6; j++) {
                                        g.setColor(Color.BLACK);
                                        g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
                                    }
                                }
                                Thread t = new Thread() {
                                    public void run() {
                                        for(int i=110; i<c1.y; i++) {
                                            g.setColor(Color.YELLOW);
                                            g.fillRect(10, 90, 990, 890);
                                            for(int gg=0; gg<7; gg++) {
                                                for(int j=0; j<6; j++) {
                                                    g.setColor(Color.BLACK);
                                                    g.fillOval(10+gg*140+6, j*140+6+100, 120, 120);
                                                }
                                            }
                                            for(int k=0; k<circle1s.size(); k++) {
                                                g.setColor(circle1s.get(k).color);
                                                g.fillOval(circle1s.get(k).x, circle1s.get(k).y, 120, 120);
                                            }
                                            for(int k=0; k<circle2s.size(); k++) {
                                                g.setColor(circle2s.get(k).color);
                                                g.fillOval(circle2s.get(k).x, circle2s.get(k).y, 120, 120);
                                            }
                                            g.setColor(c1.color);
                                            g.drawOval(c1.x, i, 120, 120);
                                            try {
                                                Thread.sleep(4);
                                            } catch(Exception e) {}
                                        }
                                        g.setColor(Color.YELLOW);
                                        g.fillRect(10, 90, 990, 890);
                                        for(int i=0; i<7; i++) {
                                            for(int j=0; j<6; j++) {
                                                g.setColor(Color.BLACK);
                                                g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
                                            }
                                        }
                                        for(int i=0; i<circle1s.size(); i++) {
                                            g.setColor(circle1s.get(i).color);
                                            g.fillOval(circle1s.get(i).x, circle1s.get(i).y, 120, 120);
                                        }
                                        for(int i=0; i<circle2s.size(); i++) {
                                            g.setColor(circle2s.get(i).color);
                                            g.fillOval(circle2s.get(i).x, circle2s.get(i).y, 120, 120);
                                        }
                                    }
                                };
                                t.start();
                                turn = 1;
                            }
                            else if(turn == 1) {
                                r1();
                            }
                        }
                    };
                    thread.start();
                }
                if(e.getX() >= 20+10+140+6+140+6+10 && e.getX() <= 20+10+140+6+140+6+10+70 &&
                        e.getY() >= 70 && e.getY() <= 100) {
                    Thread thread = new Thread() {
                        public void run() {
                            if(turn == 0) {
                                circle1 c1 = new circle1();
                                c1.x = 20+10+140+6+140+6+10-28;
                                c1.y = 110;
                                boolean fass = true;
                                for(int i=5; i>=0 && fass; i--) {
                                    if(arr[2][5-i] != 1) {
                                        fass = false;
                                        arr[2][5-i] = 1;
                                        c1.y = 100+10+6+i*140;
                                    }
                                }
                                circle1s.add(c1);
                                g.setColor(Color.YELLOW);
                                g.fillRect(10, 90, 990, 890);
                                for(int i=0; i<7; i++) {
                                    for(int j=0; j<6; j++) {
                                        g.setColor(Color.BLACK);
                                        g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
                                    }
                                }
                                Thread t = new Thread() {
                                    public void run() {
                                        for(int i=110; i<c1.y; i++) {
                                            g.setColor(Color.YELLOW);
                                            g.fillRect(10, 90, 990, 890);
                                            for(int gg=0; gg<7; gg++) {
                                                for(int j=0; j<6; j++) {
                                                    g.setColor(Color.BLACK);
                                                    g.fillOval(10+gg*140+6, j*140+6+100, 120, 120);
                                                }
                                            }
                                            for(int k=0; k<circle1s.size(); k++) {
                                                g.setColor(circle1s.get(k).color);
                                                g.fillOval(circle1s.get(k).x, circle1s.get(k).y, 120, 120);
                                            }
                                            for(int k=0; k<circle2s.size(); k++) {
                                                g.setColor(circle2s.get(k).color);
                                                g.fillOval(circle2s.get(k).x, circle2s.get(k).y, 120, 120);
                                            }
                                            g.setColor(c1.color);
                                            g.drawOval(c1.x, i, 120, 120);
                                            try {
                                                Thread.sleep(4);
                                            } catch(Exception e) {}
                                        }
                                        g.setColor(Color.YELLOW);
                                        g.fillRect(10, 90, 990, 890);
                                        for(int i=0; i<7; i++) {
                                            for(int j=0; j<6; j++) {
                                                g.setColor(Color.BLACK);
                                                g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
                                            }
                                        }
                                        for(int i=0; i<circle1s.size(); i++) {
                                            g.setColor(circle1s.get(i).color);
                                            g.fillOval(circle1s.get(i).x, circle1s.get(i).y, 120, 120);
                                        }
                                        for(int i=0; i<circle2s.size(); i++) {
                                            g.setColor(circle2s.get(i).color);
                                            g.fillOval(circle2s.get(i).x, circle2s.get(i).y, 120, 120);
                                        }
                                    }
                                };
                                t.start();
                                turn = 1;
                            }
                            else if(turn == 1) {
                                r2();
                            }
                        }
                    };
                    thread.start();
                }
                if(e.getX() >= 10+140+6+140+6+140+6+10 && e.getX() <= 10+140+6+140+6+140+6+10+70 &&
                        e.getY() >= 70 && e.getY() <= 100) {
                    Thread thread = new Thread() {
                        public void run() {
                            if(turn == 0) {
                                circle1 c1 = new circle1();
                                c1.x = 10+140+6+140+6+140+6+10-28;
                                c1.y = 110;
                                boolean fass = true;
                                for(int i=5; i>=0 && fass; i--) {
                                    if(arr[3][5-i] != 1) {
                                        fass = false;
                                        arr[3][5-i] = 1;
                                        c1.y = 100+10+6+i*140;
                                    }
                                }
                                circle1s.add(c1);
                                g.setColor(Color.YELLOW);
                                g.fillRect(10, 90, 990, 890);
                                for(int i=0; i<7; i++) {
                                    for(int j=0; j<6; j++) {
                                        g.setColor(Color.BLACK);
                                        g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
                                    }
                                }
                                Thread t = new Thread() {
                                    public void run() {
                                        for(int i=110; i<c1.y; i++) {
                                            g.setColor(Color.YELLOW);
                                            g.fillRect(10, 90, 990, 890);
                                            for(int gg=0; gg<7; gg++) {
                                                for(int j=0; j<6; j++) {
                                                    g.setColor(Color.BLACK);
                                                    g.fillOval(10+gg*140+6, j*140+6+100, 120, 120);
                                                }
                                            }
                                            for(int k=0; k<circle1s.size(); k++) {
                                                g.setColor(circle1s.get(k).color);
                                                g.fillOval(circle1s.get(k).x, circle1s.get(k).y, 120, 120);
                                            }
                                            for(int k=0; k<circle2s.size(); k++) {
                                                g.setColor(circle2s.get(k).color);
                                                g.fillOval(circle2s.get(k).x, circle2s.get(k).y, 120, 120);
                                            }
                                            g.setColor(c1.color);
                                            g.drawOval(c1.x, i, 120, 120);
                                            try {
                                                Thread.sleep(4);
                                            } catch(Exception e) {}
                                        }
                                        g.setColor(Color.YELLOW);
                                        g.fillRect(10, 90, 990, 890);
                                        for(int i=0; i<7; i++) {
                                            for(int j=0; j<6; j++) {
                                                g.setColor(Color.BLACK);
                                                g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
                                            }
                                        }
                                        for(int i=0; i<circle1s.size(); i++) {
                                            g.setColor(circle1s.get(i).color);
                                            g.fillOval(circle1s.get(i).x, circle1s.get(i).y, 120, 120);
                                        }
                                        for(int i=0; i<circle2s.size(); i++) {
                                            g.setColor(circle2s.get(i).color);
                                            g.fillOval(circle2s.get(i).x, circle2s.get(i).y, 120, 120);
                                        }
                                    }
                                };
                                t.start();
                                turn = 1;
                            }
                            else if(turn == 1) {
                                r3();
                            }
                        }
                    };
                    thread.start();
                }
                if(e.getX() >= 10+140+6+140+6+140+6+140+6+10 && e.getX() <= 10+140+6+140+6+140+6+140+6+10+70 &&
                        e.getY() >= 70 && e.getY() <= 100) {
                    Thread thread = new Thread() {
                        public void run() {
                            if(turn == 0) {
                                circle1 c1 = new circle1();
                                c1.x = 10+140+6+140+6+140+6+140+6+10-28;
                                c1.y = 110;
                                boolean fass = true;
                                for(int i=5; i>=0 && fass; i--) {
                                    if(arr[4][5-i] != 1) {
                                        fass = false;
                                        arr[4][5-i] = 1;
                                        c1.y = 100+10+6+i*140;
                                    }
                                }
                                circle1s.add(c1);
                                g.setColor(Color.YELLOW);
                                g.fillRect(10, 90, 990, 890);
                                for(int i=0; i<7; i++) {
                                    for(int j=0; j<6; j++) {
                                        g.setColor(Color.BLACK);
                                        g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
                                    }
                                }
                                Thread t = new Thread() {
                                    public void run() {
                                        for(int i=110; i<c1.y; i++) {
                                            g.setColor(Color.YELLOW);
                                            g.fillRect(10, 90, 990, 890);
                                            for(int gg=0; gg<7; gg++) {
                                                for(int j=0; j<6; j++) {
                                                    g.setColor(Color.BLACK);
                                                    g.fillOval(10+gg*140+6, j*140+6+100, 120, 120);
                                                }
                                            }
                                            for(int k=0; k<circle1s.size(); k++) {
                                                g.setColor(circle1s.get(k).color);
                                                g.fillOval(circle1s.get(k).x, circle1s.get(k).y, 120, 120);
                                            }
                                            for(int k=0; k<circle2s.size(); k++) {
                                                g.setColor(circle2s.get(k).color);
                                                g.fillOval(circle2s.get(k).x, circle2s.get(k).y, 120, 120);
                                            }
                                            g.setColor(c1.color);
                                            g.drawOval(c1.x, i, 120, 120);
                                            try {
                                                Thread.sleep(4);
                                            } catch(Exception e) {}
                                        }
                                        g.setColor(Color.YELLOW);
                                        g.fillRect(10, 90, 990, 890);
                                        for(int i=0; i<7; i++) {
                                            for(int j=0; j<6; j++) {
                                                g.setColor(Color.BLACK);
                                                g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
                                            }
                                        }
                                        for(int i=0; i<circle1s.size(); i++) {
                                            g.setColor(circle1s.get(i).color);
                                            g.fillOval(circle1s.get(i).x, circle1s.get(i).y, 120, 120);
                                        }
                                        for(int i=0; i<circle2s.size(); i++) {
                                            g.setColor(circle2s.get(i).color);
                                            g.fillOval(circle2s.get(i).x, circle2s.get(i).y, 120, 120);
                                        }
                                    }
                                };
                                t.start();
                                turn = 1;
                            }
                            else if(turn == 1) {
                                r4();
                            }
                        }
                    };
                    thread.start();
                }
                if(e.getX() >= 10+140+6+140+6+140+6+140+6+140+6+10 && e.getX() <= 10+140+6+140+6+140+6+140+6+140+6+10+70 &&
                        e.getY() >= 70 && e.getY() <= 100) {
                    Thread thread = new Thread() {
                        public void run() {
                            if(turn == 0) {
                                circle1 c1 = new circle1();
                                c1.x = 10+140+6+140+6+140+6+140+6+140+6+10-28;
                                c1.y = 110;
                                boolean fass = true;
                                for(int i=5; i>=0 && fass; i--) {
                                    if(arr[5][5-i] != 1) {
                                        fass = false;
                                        arr[5][5-i] = 1;
                                        c1.y = 100+10+6+i*140;
                                    }
                                }
                                circle1s.add(c1);
                                g.setColor(Color.YELLOW);
                                g.fillRect(10, 90, 990, 890);
                                for(int i=0; i<7; i++) {
                                    for(int j=0; j<6; j++) {
                                        g.setColor(Color.BLACK);
                                        g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
                                    }
                                }
                                Thread t = new Thread() {
                                    public void run() {
                                        for(int i=110; i<c1.y; i++) {
                                            g.setColor(Color.YELLOW);
                                            g.fillRect(10, 90, 990, 890);
                                            for(int gg=0; gg<7; gg++) {
                                                for(int j=0; j<6; j++) {
                                                    g.setColor(Color.BLACK);
                                                    g.fillOval(10+gg*140+6, j*140+6+100, 120, 120);
                                                }
                                            }
                                            for(int k=0; k<circle1s.size(); k++) {
                                                g.setColor(circle1s.get(k).color);
                                                g.fillOval(circle1s.get(k).x, circle1s.get(k).y, 120, 120);
                                            }
                                            for(int k=0; k<circle2s.size(); k++) {
                                                g.setColor(circle2s.get(k).color);
                                                g.fillOval(circle2s.get(k).x, circle2s.get(k).y, 120, 120);
                                            }
                                            g.setColor(c1.color);
                                            g.drawOval(c1.x, i, 120, 120);
                                            try {
                                                Thread.sleep(4);
                                            } catch(Exception e) {}
                                        }
                                        g.setColor(Color.YELLOW);
                                        g.fillRect(10, 90, 990, 890);
                                        for(int i=0; i<7; i++) {
                                            for(int j=0; j<6; j++) {
                                                g.setColor(Color.BLACK);
                                                g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
                                            }
                                        }
                                        for(int i=0; i<circle1s.size(); i++) {
                                            g.setColor(circle1s.get(i).color);
                                            g.fillOval(circle1s.get(i).x, circle1s.get(i).y, 120, 120);
                                        }
                                        for(int i=0; i<circle2s.size(); i++) {
                                            g.setColor(circle2s.get(i).color);
                                            g.fillOval(circle2s.get(i).x, circle2s.get(i).y, 120, 120);
                                        }
                                    }
                                };
                                t.start();
                                turn = 1;
                            }
                            else if(turn == 1) {
                                r5();
                            }
                        }
                    };
                    thread.start();
                }
                if(e.getX() >= 10+140+6+140+6+140+6+140+6+140+6+140+6+10 && e.getX() <= 10+140+6+140+6+140+6+140+6+140+6+140+6+10+70 &&
                        e.getY() >= 70 && e.getY() <= 100) {
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            if(turn == 0) {
                                circle1 c1 = new circle1();
                                c1.x = 10+140+6+140+6+140+6+140+140+140-28;
                                c1.y = 110;
                                boolean fass = true;
                                for(int i=5; i>=0 && fass; i--) {
                                    if(arr[6][5-i] != 1) {
                                        fass = false;
                                        arr[6][5-i] = 1;
                                        c1.y = 100+10+6+i*140;
                                    }
                                }
                                circle1s.add(c1);
                                g.setColor(Color.YELLOW);
                                g.fillRect(10, 90, 990, 890);
                                for(int i=0; i<7; i++) {
                                    for(int j=0; j<6; j++) {
                                        g.setColor(Color.BLACK);
                                        g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
                                    }
                                }
                                Thread t = new Thread() {
                                    public void run() {
                                        for(int i=110; i<c1.y; i++) {
                                            g.setColor(Color.YELLOW);
                                            g.fillRect(10, 90, 990, 890);
                                            for(int gg=0; gg<7; gg++) {
                                                for(int j=0; j<6; j++) {
                                                    g.setColor(Color.BLACK);
                                                    g.fillOval(10+gg*140+6, j*140+6+100, 120, 120);
                                                }
                                            }
                                            for(int k=0; k<circle1s.size(); k++) {
                                                g.setColor(circle1s.get(k).color);
                                                g.fillOval(circle1s.get(k).x, circle1s.get(k).y, 120, 120);
                                            }
                                            for(int k=0; k<circle2s.size(); k++) {
                                                g.setColor(circle2s.get(k).color);
                                                g.fillOval(circle2s.get(k).x, circle2s.get(k).y, 120, 120);
                                            }
                                            g.setColor(c1.color);
                                            g.drawOval(c1.x, i, 120, 120);
                                            try {
                                                Thread.sleep(4);
                                            } catch(Exception e) {}
                                        }
                                        g.setColor(Color.YELLOW);
                                        g.fillRect(10, 90, 990, 890);
                                        for(int i=0; i<7; i++) {
                                            for(int j=0; j<6; j++) {
                                                g.setColor(Color.BLACK);
                                                g.fillOval(10+i*140+6, j*140+6+100, 120, 120);
                                            }
                                        }
                                        for(int i=0; i<circle1s.size(); i++) {
                                            g.setColor(circle1s.get(i).color);
                                            g.fillOval(circle1s.get(i).x, circle1s.get(i).y, 120, 120);
                                        }
                                        for(int i=0; i<circle2s.size(); i++) {
                                            g.setColor(circle2s.get(i).color);
                                            g.fillOval(circle2s.get(i).x, circle2s.get(i).y, 120, 120);
                                        }
                                    }
                                };
                                t.start();
                                turn = 1;
                            }
                            else if(turn == 1) {
                                r6();
                            }
                        }
                    });
                    thread.start();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }
    
    public class circle1 {
        Color color = Color.MAGENTA;
        int x, y;
        int width = 120;
        int height = 120;
    }
    
    public class circle2 {
        Color color = Color.GREEN;
        int x, y;
        int width = 120;
        int height = 120;
    }

    public static void main(String args[]) {
        new Connect4();
    }
}