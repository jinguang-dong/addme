package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.Display;
import com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class twp implements tws {
    private final Context a;

    public twp(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.tws
    public final snh a(txs txsVar) {
        return null;
    }

    @Override // defpackage.tws
    public final txp b() {
        String str = twd.a;
        return (txp) twd.a(txp.a.m(), "current_device_params", 894990891, true, this.a);
    }

    @Override // defpackage.tws
    public final txr d() {
        return null;
    }

    @Override // defpackage.tws
    public final void e() {
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a7 A[EXC_TOP_SPLITTER, PHI: r5
      0x00a7: PHI (r5v5 java.io.BufferedOutputStream) = (r5v4 java.io.BufferedOutputStream), (r5v6 java.io.BufferedOutputStream) binds: [B:36:0x00a5, B:41:0x00c1] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c4 A[PHI: r4 r5
      0x00c4: PHI (r4v2 boolean) = (r4v0 boolean), (r4v0 boolean), (r4v0 boolean), (r4v3 boolean) binds: [B:36:0x00a5, B:37:0x00a7, B:41:0x00c1, B:27:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r5v7 java.io.BufferedOutputStream) = 
      (r5v4 java.io.BufferedOutputStream)
      (r5v5 java.io.BufferedOutputStream)
      (r5v6 java.io.BufferedOutputStream)
      (r5v1 java.io.BufferedOutputStream)
     binds: [B:36:0x00a5, B:37:0x00a7, B:41:0x00c1, B:27:0x0084] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // defpackage.tws
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(defpackage.txp r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "Error writing parameters: "
            java.lang.String r1 = "Parameters file not found for writing: "
            r2 = 1
            java.lang.String r3 = "current_device_params"
            r4 = 0
            if (r9 != 0) goto L38
            android.content.Context r8 = r8.a
            java.lang.String r9 = defpackage.twd.a
            java.io.File r8 = defpackage.twd.b(r3, r8)     // Catch: java.lang.IllegalStateException -> L1d
            boolean r9 = r8.exists()     // Catch: java.lang.IllegalStateException -> L1d
            if (r9 == 0) goto L2e
            boolean r2 = r8.delete()     // Catch: java.lang.IllegalStateException -> L1d
            goto L2e
        L1d:
            r8 = move-exception
            java.lang.String r9 = defpackage.twd.a
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "Error clearing device parameters: "
            java.lang.String r8 = r0.concat(r8)
            android.util.Log.w(r9, r8)
            r2 = r4
        L2e:
            if (r2 != 0) goto L37
            java.lang.String r8 = defpackage.twd.a
            java.lang.String r9 = "Could not clear Cardboard parameters from storage."
            android.util.Log.e(r8, r9)
        L37:
            return r2
        L38:
            android.content.Context r8 = r8.a
            java.lang.String r5 = defpackage.twd.a
            byte[] r9 = r9.h()
            r5 = 0
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L8d java.lang.IllegalStateException -> L8f java.io.FileNotFoundException -> Lab
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L8d java.lang.IllegalStateException -> L8f java.io.FileNotFoundException -> Lab
            java.io.File r8 = defpackage.twd.b(r3, r8)     // Catch: java.lang.Throwable -> L8d java.lang.IllegalStateException -> L8f java.io.FileNotFoundException -> Lab
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L8d java.lang.IllegalStateException -> L8f java.io.FileNotFoundException -> Lab
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L8d java.lang.IllegalStateException -> L8f java.io.FileNotFoundException -> Lab
            r8 = 8
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)     // Catch: java.lang.Throwable -> L6a java.lang.IllegalStateException -> L6c java.io.IOException -> L6e
            r3 = 894990891(0x35587a2b, float:8.064405E-7)
            r8.putInt(r3)     // Catch: java.lang.Throwable -> L6a java.lang.IllegalStateException -> L6c java.io.IOException -> L6e
            int r3 = r9.length     // Catch: java.lang.Throwable -> L6a java.lang.IllegalStateException -> L6c java.io.IOException -> L6e
            r8.putInt(r3)     // Catch: java.lang.Throwable -> L6a java.lang.IllegalStateException -> L6c java.io.IOException -> L6e
            byte[] r8 = r8.array()     // Catch: java.lang.Throwable -> L6a java.lang.IllegalStateException -> L6c java.io.IOException -> L6e
            r6.write(r8)     // Catch: java.lang.Throwable -> L6a java.lang.IllegalStateException -> L6c java.io.IOException -> L6e
            r6.write(r9)     // Catch: java.lang.Throwable -> L6a java.lang.IllegalStateException -> L6c java.io.IOException -> L6e
            goto L81
        L6a:
            r8 = move-exception
            goto L86
        L6c:
            r8 = move-exception
            goto L88
        L6e:
            r8 = move-exception
            java.lang.String r9 = defpackage.twd.a     // Catch: java.lang.Throwable -> L6a java.lang.IllegalStateException -> L6c java.io.FileNotFoundException -> L8a
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6a java.lang.IllegalStateException -> L6c java.io.FileNotFoundException -> L8a
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L6a java.lang.IllegalStateException -> L6c java.io.FileNotFoundException -> L8a
            java.lang.String r8 = r0.concat(r8)     // Catch: java.lang.Throwable -> L6a java.lang.IllegalStateException -> L6c java.io.FileNotFoundException -> L8a
            android.util.Log.w(r9, r8)     // Catch: java.lang.Throwable -> L6a java.lang.IllegalStateException -> L6c java.io.FileNotFoundException -> L8a
            r2 = r4
        L81:
            r6.close()     // Catch: java.io.IOException -> L84
        L84:
            r4 = r2
            goto Lc4
        L86:
            r5 = r6
            goto Lce
        L88:
            r5 = r6
            goto L90
        L8a:
            r8 = move-exception
            r5 = r6
            goto Lac
        L8d:
            r8 = move-exception
            goto Lce
        L8f:
            r8 = move-exception
        L90:
            java.lang.String r9 = defpackage.twd.a     // Catch: java.lang.Throwable -> L8d
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L8d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L8d
            r1.append(r8)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L8d
            android.util.Log.w(r9, r8)     // Catch: java.lang.Throwable -> L8d
            if (r5 == 0) goto Lc4
        La7:
            r5.close()     // Catch: java.io.IOException -> Lc4
            goto Lc4
        Lab:
            r8 = move-exception
        Lac:
            java.lang.String r9 = defpackage.twd.a     // Catch: java.lang.Throwable -> L8d
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L8d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L8d
            r0.append(r8)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Throwable -> L8d
            android.util.Log.e(r9, r8)     // Catch: java.lang.Throwable -> L8d
            if (r5 == 0) goto Lc4
            goto La7
        Lc4:
            if (r4 != 0) goto Lcd
            java.lang.String r8 = defpackage.twd.a
            java.lang.String r9 = "Could not write Cardboard parameters to storage."
            android.util.Log.e(r8, r9)
        Lcd:
            return r4
        Lce:
            if (r5 == 0) goto Ld3
            r5.close()     // Catch: java.io.IOException -> Ld3
        Ld3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twp.f(txp):boolean");
    }

    @Override // defpackage.tws
    public final txq c() {
        ArrayList arrayList;
        twq twqVar;
        String str;
        String str2;
        String str3;
        String str4 = twd.a;
        txq txqVar = txq.a;
        tpc tpcVarM = txqVar.m();
        Context context = this.a;
        txq txqVar2 = (txq) twd.a(tpcVarM, "phone_params", 779508118, false, context);
        if (txqVar2 != null) {
            return txqVar2;
        }
        ArrayList arrayList2 = twr.a;
        tpc tpcVarM2 = txqVar.m();
        List list = twr.b;
        String str5 = Build.DEVICE;
        String strA = twr.a(str5);
        Iterator it = list.iterator();
        do {
            arrayList = null;
            if (!it.hasNext()) {
                return null;
            }
            twqVar = (twq) it.next();
            str = Build.MODEL;
            str2 = Build.MANUFACTURER;
            str3 = Build.HARDWARE;
            if (twqVar.a(str2, str5, str, str3)) {
                break;
            }
        } while (!twqVar.a(str2, strA, str, str3));
        String.format(GAQqzWiWWcYOgy.IZnStRQuHlXWz, twqVar.a, twqVar.b, twqVar.c, twqVar.d, twqVar.e, twqVar.f, twqVar.g);
        Float f = twqVar.e;
        if (f != null) {
            float fFloatValue = f.floatValue();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            txq txqVar3 = (txq) tpcVarM2.b;
            txqVar3.b |= 1;
            txqVar3.c = fFloatValue;
        }
        Float f2 = twqVar.f;
        if (f2 != null) {
            float fFloatValue2 = f2.floatValue();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            txq txqVar4 = (txq) tpcVarM2.b;
            txqVar4.b |= 2;
            txqVar4.d = fFloatValue2;
        }
        Float f3 = twqVar.g;
        if (f3 != null) {
            float fFloatValue3 = f3.floatValue();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            txq txqVar5 = (txq) tpcVarM2.b;
            txqVar5.b |= 4;
            txqVar5.e = fFloatValue3;
        }
        if ("samsung".equals(Build.MANUFACTURER)) {
            Display displayN = thu.n(context);
            DisplayMetrics displayMetricsM = thu.m(displayN);
            int iMax = displayMetricsM.widthPixels;
            if (displayN != null && (arrayList = twr.a) == null) {
                twr.a = new ArrayList();
                Display.Mode[] supportedModes = displayN.getSupportedModes();
                if (supportedModes != null) {
                    for (Display.Mode mode : supportedModes) {
                        twr.a.add(new Size(mode.getPhysicalWidth(), mode.getPhysicalHeight()));
                    }
                }
                arrayList = twr.a;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Size size2 = (Size) arrayList.get(i);
                    iMax = Math.max(iMax, Math.max(size2.getWidth(), size2.getHeight()));
                }
                if (displayMetricsM.widthPixels != iMax) {
                    float f4 = displayMetricsM.widthPixels / iMax;
                    tph tphVar = tpcVarM2.b;
                    float f5 = ((txq) tphVar).c * f4;
                    if (!tphVar.C()) {
                        tpcVarM2.o();
                    }
                    tph tphVar2 = tpcVarM2.b;
                    txq txqVar6 = (txq) tphVar2;
                    txqVar6.b |= 1;
                    txqVar6.c = f5;
                    float f6 = txqVar6.d * f4;
                    if (!tphVar2.C()) {
                        tpcVarM2.o();
                    }
                    txq txqVar7 = (txq) tpcVarM2.b;
                    txqVar7.b |= 2;
                    txqVar7.d = f6;
                }
            }
        }
        return (txq) tpcVarM2.l();
    }
}
