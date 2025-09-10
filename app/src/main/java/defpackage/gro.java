package defpackage;

import com.google.android.libraries.barhopper.Barcode;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gro {
    public static final sbv a;

    static {
        sbr sbrVar = new sbr();
        sbrVar.f(rfw.ADDRESS, gry.MAP);
        sbrVar.f(rfw.CALENDAR_ENTRY, gry.CALENDAR);
        sbrVar.f(rfw.h, gry.CONTACT);
        sbrVar.f(rfw.EMAIL, gry.EMAIL);
        sbrVar.f(rfw.PHONE, gry.CALL);
        sbrVar.f(rfw.PRODUCT_UPC, gry.SHOPPING);
        sbrVar.f(rfw.QR, gry.SEARCH);
        sbrVar.f(rfw.QR_TEXT, gry.SEARCH);
        sbrVar.f(rfw.RAW_BARCODE, gry.SHOPPING);
        sbrVar.f(rfw.TEXT_BLOCK, gry.COPY);
        sbrVar.f(rfw.URL, gry.OPEN_URL);
        sbrVar.f(rfw.FOREIGN_TEXT, gry.TRANSLATE);
        sbrVar.f(rfw.QR_WIFI, gry.WIFI);
        sbrVar.f(rfw.TEXT_WIFI, gry.WIFI);
        sbrVar.f(rfw.SMS, gry.SMS);
        sbrVar.f(rfw.DOCUMENT_SCANNING, gry.DOCUMENT_SCANNING);
        sbrVar.f(rfw.LABELED_PRODUCT, gry.SHOPPING);
        sbrVar.f(rfw.APPAREL, gry.SHOPPING);
        sbrVar.f(rfw.TEXT_SELECTION, gry.TEXT_SELECTION);
        sbrVar.f(rfw.QR_GEO, gry.MAP);
        a = sbrVar.b();
    }

    public static gsa a(Barcode.CalendarDateTime calendarDateTime) {
        tpc tpcVarM = gsa.a.m();
        boolean z = calendarDateTime.isUtc;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        ((gsa) tphVar).h = z;
        int i = calendarDateTime.year;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        ((gsa) tphVar2).b = i;
        int i2 = calendarDateTime.month;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        ((gsa) tphVar3).c = i2;
        int i3 = calendarDateTime.day;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        tph tphVar4 = tpcVarM.b;
        ((gsa) tphVar4).d = i3;
        int i4 = calendarDateTime.hours;
        if (!tphVar4.C()) {
            tpcVarM.o();
        }
        tph tphVar5 = tpcVarM.b;
        ((gsa) tphVar5).e = i4;
        int i5 = calendarDateTime.minutes;
        if (!tphVar5.C()) {
            tpcVarM.o();
        }
        tph tphVar6 = tpcVarM.b;
        ((gsa) tphVar6).f = i5;
        int i6 = calendarDateTime.seconds;
        if (!tphVar6.C()) {
            tpcVarM.o();
        }
        ((gsa) tpcVarM.b).g = i6;
        return (gsa) tpcVarM.l();
    }
}
