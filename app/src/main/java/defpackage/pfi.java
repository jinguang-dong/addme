package defpackage;

import android.util.Printer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pfi {
    public final pfr a;
    public final pdt b;
    public final pmj c;
    public final lat d;
    private final pjp e;

    public pfi(pfr pfrVar, pdt pdtVar, pjp pjpVar, lat latVar, pmj pmjVar) {
        this.a = pfrVar;
        this.b = pdtVar;
        this.e = pjpVar;
        this.d = latVar;
        this.c = pmjVar;
    }

    public static final void e(Printer printer, String str, String str2) {
        printer.println(ojl.bI("%-20s %s", str, str2));
    }

    public final peo a(peq peqVar) {
        peo peoVarB = b(peqVar);
        peoVarB.getClass();
        return peoVarB;
    }

    public final peo b(peq peqVar) {
        return this.d.w(peqVar);
    }

    public final pjo c() {
        return this.e.a(d());
    }

    public final pjr d() {
        return this.b.a;
    }
}
