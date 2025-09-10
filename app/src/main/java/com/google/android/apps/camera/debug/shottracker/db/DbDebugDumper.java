package com.google.android.apps.camera.debug.shottracker.db;

import android.content.Context;
import com.google.android.gms.wearable.aXYS.zflNUOOzDfM;
import defpackage.cvz;
import defpackage.dcn;
import defpackage.dei;
import defpackage.dvj;
import defpackage.hew;
import defpackage.hez;
import defpackage.hfc;
import defpackage.hfd;
import defpackage.pbh;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DbDebugDumper extends pbh {
    private static final DateTimeFormatter a = DateTimeFormatter.ofPattern("MM-dd HH:mm:ss.SSS").withZone(ZoneId.systemDefault());

    @Override // defpackage.pbh
    public final void a(PrintWriter printWriter) {
        Context context = getContext();
        context.getClass();
        dcn dcnVarF = cvz.f(context, ShotDatabase.class, "shot_db");
        dcnVarF.c();
        ShotDatabase shotDatabase = (ShotDatabase) dcnVarF.a();
        List<hez> list = (List) dei.a(((hew) shotDatabase.w()).a, true, false, new dvj(9));
        List list2 = (List) dei.a(((hfc) shotDatabase.x()).a, true, false, new dvj(11));
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (hez hezVar : list) {
            if (hezVar.l || (hezVar.d == 0 && hezVar.e == 0 && hezVar.f == 0)) {
                map2.put(Long.valueOf(hezVar.a), hezVar);
            } else {
                map.put(Long.valueOf(hezVar.a), hezVar);
            }
        }
        printWriter.println("DUMPING: " + map2.size() + " SUSPECT, " + map.size() + " OK");
        printWriter.flush();
        if (!map2.isEmpty()) {
            printWriter.println("\nSUSPECT SHOTS");
            b(map2, list2, printWriter);
        }
        if (!map.isEmpty()) {
            printWriter.println("\nOK SHOTS");
            b(map, list2, printWriter);
        }
        printWriter.println("\nDUMPED: " + map2.size() + " SUSPECT, " + map.size() + " OK");
        printWriter.flush();
        shotDatabase.m();
    }

    private static void b(Map map, List list, PrintWriter printWriter) {
        Iterator it;
        PrintWriter printWriter2;
        PrintWriter printWriter3 = printWriter;
        Iterator it2 = list.iterator();
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        Instant instant = null;
        while (it2.hasNext()) {
            hfd hfdVar = (hfd) it2.next();
            hez hezVar = (hez) map.get(Long.valueOf(hfdVar.b));
            if (hezVar != null) {
                if (hfdVar.b != j2) {
                    if (j2 < j) {
                        printWriter3.println("");
                        printWriter3.flush();
                    }
                    it = it2;
                    printWriter2 = printWriter;
                    printWriter2.println(hezVar.a + " " + hezVar.i + "[pid=" + hezVar.j + "] title=" + hezVar.b + " captureSessionType=" + hezVar.h + " start=" + hezVar.c + " persisted=" + hezVar.d + " canceled=" + hezVar.e + " deleted=" + hezVar.f + " mostRecentEvent=" + hezVar.g + zflNUOOzDfM.jPFTxMeT + hezVar.l);
                    instant = null;
                } else {
                    it = it2;
                    printWriter2 = printWriter3;
                }
                Instant instantOfEpochMilli = Instant.ofEpochMilli(hfdVar.c);
                Duration durationBetween = instant == null ? Duration.ZERO : Duration.between(instant, instantOfEpochMilli);
                long j3 = hfdVar.c;
                String str = a.format(instantOfEpochMilli);
                long millis = durationBetween.toMillis();
                String str2 = millis >= 1000 ? String.format("%10.3fs", Double.valueOf(millis / 1000.0d)) : String.format("      .%03ds", Long.valueOf(millis));
                printWriter2.println("  " + j3 + "  " + str + str2 + ": " + hfdVar.d);
                j2 = hfdVar.b;
                instant = instantOfEpochMilli;
                printWriter3 = printWriter2;
                it2 = it;
            }
            j = Long.MAX_VALUE;
        }
        printWriter3.flush();
    }
}
