package defpackage;

import java.util.ArrayList;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mae implements Supplier {
    private final /* synthetic */ int a;

    public /* synthetic */ mae(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new ArrayList();
            case 1:
                return new ArrayList();
            case 2:
                return new ArrayList();
            case 3:
                return new IllegalArgumentException("Could not find range.");
            case 4:
                return new IllegalArgumentException("Could not find range.");
            case 5:
                return Boolean.FALSE;
            case 6:
                return new scl();
            case 7:
                sck sckVar = sck.a;
                return new rtl((byte[]) null);
            case 8:
                return new sbr();
            case 9:
                return new sdy();
            case 10:
                ((sgt) tdv.a.c().M(5828)).s("Camera is not tracking, building empty AllInCapture");
                tpc tpcVarM = szr.a.m();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                szr szrVar = (szr) tpcVarM.b;
                szrVar.b |= 1;
                szrVar.c = false;
                return tpcVarM;
            case 11:
                return new tey("No tracking session");
            default:
                return new tey("No tracking session.");
        }
    }
}
