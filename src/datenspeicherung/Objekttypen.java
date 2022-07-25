package Datenspeicherung;

import ausstattung.*;

public class Objecttypen {

    //beamertypen

    BeamerTyp LCDProjektor = new BeamerTyp("TOPVISION", "T26", 9500, true);

    BeamerTyp DLPProjektor = new BeamerTyp("ACER", "P5530", 7000, false);

    BeamerTyp LEDProjektor = new BeamerTyp("ViewSonic", "X100-4k", 2500, true);

    //Tafeltypen

    //Kreidetafeltypen

    KreidetafelTyp großeKreideTafel = new KreidetafelTyp(true, false, 250, 180);
    KreidetafelTyp mittlereKreideTafel = new KreidetafelTyp(false, true, 220, 160);
    KreidetafelTyp kleineKreideTafel = new KreidetafelTyp(false, true, 200, 140);

    //Smartboardtypen

    WhiteboardTyp flipChart = new WhiteboardTyp(false, true, 60 , 100);
    WhiteboardTyp wandWhiteboard = new WhiteboardTyp(true, false, 180 , 120);
    WhiteboardTyp verschiebaresWhiteboard = new WhiteboardTyp(false, true, 180 , 120);

    //Smartboardtypen

    SmartboardTyp teuresSmartboard = new SmartboardTyp("SMARTBOARD", "MX255 PRO", 3000);
    SmartboardTyp billigesSmartboard = new SmartboardTyp("iiyama", "Lite PRO", 1500);


    //Tischtypen

    TischTyp einzelTisch = new TischTyp(1, false, false, 80, 60);
    TischTyp zweierTisch = new TischTyp(2, false, false, 160, 60);
    TischTyp computerTisch = new TischTyp(2, true, false, 180, 70);
    TischTyp höhenvertellbarerTisch = new TischTyp(1, true, true, 160, 80);

    //Stuhltyp

    StuhlTyp drehstuhl = new StuhlTyp(true, "Dynamic");
    StuhlTyp einfacherStuhl = new StuhlTyp(false, "Static");

    //KameraTypen //Pixel in mega angegeben, Brennweite in mm

    KameraTyp statischeWebcam = new KameraTyp("Logitech", "Streamcam", 16, 50, false);
    KameraTyp bewegbareWebcam = new KameraTyp("csl", "Full HD Webcam", 4, 100, true);

    //PcTyp
    //Taktfrequenz in GHz

    PCTyp windowsPc = new PCTyp("Windows", 4.4, true, (short)16);
    PCTyp linuxPc = new PCTyp("Linux", 2.2, false, (short)4);
    PCTyp iosPC = new PCTyp("IOS", 3.2, false, (short) 8);

    //MikrofonTyp
    //Empfindlichkeit in max db

    MikrofonTyp konferenzMikrofon = new MikrofonTyp("Rhode", "NT-USB", true, 80);
    MikrofonTyp bbbMikrofon = new MikrofonTyp("Tonor", "Q9", false, 50);








}
