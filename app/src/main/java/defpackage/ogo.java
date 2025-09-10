package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ogo implements oom {
    private final ogd a;
    private final int b;
    private final ofl c;
    private final long d;
    private final long e;

    public ogo(ogd ogdVar, int i, ofl oflVar, long j, long j2) {
        this.a = ogdVar;
        this.b = i;
        this.c = oflVar;
        this.d = j;
        this.e = j2;
    }

    public static ohs b(oga ogaVar, ohm ohmVar, int i) {
        int[] iArr;
        int[] iArr2;
        ohr ohrVar = ohmVar.m;
        ohs ohsVar = ohrVar == null ? null : ohrVar.d;
        if (ohsVar == null || !ohsVar.b || ((iArr = ohsVar.d) != null ? !lpa.A(iArr, i) : !((iArr2 = ohsVar.f) == null || !lpa.A(iArr2, i))) || ogaVar.j >= ohsVar.e) {
            return null;
        }
        return ohsVar;
    }

    @Override // defpackage.oom
    public final void a(oor oorVar) {
        oga ogaVarB;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        ogd ogdVar = this.a;
        if (ogdVar.g()) {
            oit oitVar = ois.a().a;
            if ((oitVar == null || oitVar.b) && (ogaVarB = ogdVar.b(this.c)) != null) {
                Object obj = ogaVarB.b;
                if (obj instanceof ohm) {
                    long j3 = this.d;
                    boolean z = j3 > 0;
                    if (oitVar != null) {
                        z &= oitVar.c;
                        ohm ohmVar = (ohm) obj;
                        boolean zC = ohmVar.C();
                        i = oitVar.d;
                        int i7 = oitVar.e;
                        int i8 = oitVar.a;
                        if (!zC || ohmVar.l()) {
                            i2 = i8;
                            i3 = i7;
                        } else {
                            ohs ohsVarB = b(ogaVarB, ohmVar, this.b);
                            if (ohsVarB == null) {
                                return;
                            }
                            boolean z2 = ohsVarB.c && j3 > 0;
                            i2 = i8;
                            i3 = ohsVarB.e;
                            z = z2;
                        }
                    } else {
                        i = 5000;
                        i2 = 0;
                        i3 = 100;
                    }
                    int iElapsedRealtime = -1;
                    if (oorVar.f()) {
                        i6 = 0;
                        i5 = 0;
                    } else if (((oow) oorVar).c) {
                        i5 = -1;
                        i6 = 100;
                    } else {
                        Exception excC = oorVar.c();
                        if (excC instanceof oep) {
                            Status status = ((oep) excC).a;
                            i4 = status.e;
                            odj odjVar = status.h;
                            if (odjVar != null) {
                                i5 = odjVar.c;
                            }
                            i6 = i4;
                        } else {
                            i4 = 101;
                        }
                        i5 = -1;
                        i6 = i4;
                    }
                    if (z) {
                        long j4 = this.e;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                        j = j3;
                        j2 = jCurrentTimeMillis;
                    } else {
                        j = 0;
                        j2 = 0;
                    }
                    int i9 = ((ohm) obj).i;
                    int i10 = this.b;
                    Handler handler = ogdVar.n;
                    handler.sendMessage(handler.obtainMessage(18, new ogp(new oil(i10, i6, i5, j, j2, null, null, i9, iElapsedRealtime), i2, i, i3)));
                }
            }
        }
    }
}
