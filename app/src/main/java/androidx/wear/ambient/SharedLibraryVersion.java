package androidx.wear.ambient;

import android.content.Context;
import com.google.android.wearable.WearableSharedLib;
import defpackage.afo;
import defpackage.afr;
import defpackage.arp;
import defpackage.arq;
import defpackage.ars;
import defpackage.awb;
import defpackage.ayb;
import defpackage.ayc;
import defpackage.ayg;
import defpackage.ayp;
import defpackage.bag;
import defpackage.bai;
import defpackage.bay;
import defpackage.bdq;
import defpackage.bfh;
import defpackage.bko;
import defpackage.bkv;
import defpackage.cdo;
import defpackage.djh;
import defpackage.dlq;
import defpackage.dlr;
import defpackage.dlw;
import defpackage.doq;
import defpackage.dor;
import defpackage.dpn;
import defpackage.dpu;
import defpackage.dpv;
import defpackage.dpx;
import defpackage.drf;
import defpackage.drh;
import defpackage.drn;
import defpackage.drv;
import defpackage.drw;
import defpackage.ebn;
import defpackage.uiu;
import defpackage.uiv;
import defpackage.ukc;
import defpackage.ukv;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SharedLibraryVersion {

    /* compiled from: PG */
    final class PresenceHolder {
        static final boolean a;

        static {
            boolean z;
            try {
                Class.forName("com.google.android.wearable.compat.WearableActivityController");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            a = z;
        }

        private PresenceHolder() {
        }
    }

    /* compiled from: PG */
    final class VersionHolder {
        static final int a = WearableSharedLib.version();

        private VersionHolder() {
        }
    }

    public static final ukv a(int i) {
        int i2 = (i / 20) * 20;
        return ukc.u(Math.max(i2 - 30, 0), i2 + 50);
    }

    public static final int b(dlq dlqVar) {
        List list = dlqVar.d;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((dlr) list.get(i2)).o;
        }
        return i / list.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4 A[Catch: dkp -> 0x017a, TryCatch #4 {dkp -> 0x017a, blocks: (B:31:0x00b0, B:33:0x00b4, B:35:0x00be, B:37:0x00cb, B:42:0x00db, B:46:0x010a, B:50:0x0113), top: B:97:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb A[Catch: dkp -> 0x017a, TryCatch #4 {dkp -> 0x017a, blocks: (B:31:0x00b0, B:33:0x00b4, B:35:0x00be, B:37:0x00cb, B:42:0x00db, B:46:0x010a, B:50:0x0113), top: B:97:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ed  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x015a -> B:18:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(defpackage.dlw r26, int r27, defpackage.chq r28, defpackage.aim r29, defpackage.uhb r30) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.ambient.SharedLibraryVersion.c(dlw, int, chq, aim, uhb):java.lang.Object");
    }

    public static final boolean d(boolean z, dlw dlwVar, int i) {
        if (z) {
            if (dlwVar.b() > i) {
                return true;
            }
            return dlwVar.b() == i && dlwVar.c() > 0;
        }
        if (dlwVar.b() < i) {
            return true;
        }
        return dlwVar.b() == i && dlwVar.c() < 0;
    }

    public static final long e(Context context, int i) {
        return bko.i(context.getResources().getColor(i, context.getTheme()));
    }

    public static final uiv f(long j, uiv uivVar) {
        return new bfh(1110354316, true, new dpv(j, uivVar));
    }

    public static final uiv g(long j, cdo cdoVar, drn drnVar, uiv uivVar) {
        return new bfh(-1476271487, true, new dpu(j, cdoVar, drnVar, uivVar, 0));
    }

    public static final doq h(ayc aycVar) {
        return (doq) aycVar.e(dor.a);
    }

    public static final drf i(ayc aycVar) {
        return (drf) aycVar.e(drh.a);
    }

    public static final drv j(ayc aycVar) {
        return (drv) aycVar.e(drw.b);
    }

    public static final void k(doq doqVar, drv drvVar, drf drfVar, ebn ebnVar, uiu uiuVar, ayc aycVar, int i) {
        int i2;
        drf drfVarI;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-2076142485);
        if (i3 == 0) {
            i2 = (true != aycVarC.B(doqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.B(drvVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.B(ebnVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != aycVarC.D(uiuVar) ? 8192 : 16384;
        }
        if (aycVarC.H((i2 & 9363) != 9362, i2 & 1)) {
            aycVarC.s();
            if ((i & 1) == 0 || aycVarC.E()) {
                drfVarI = i(aycVarC);
            } else {
                aycVarC.r();
                drfVarI = drfVar;
            }
            aycVarC.l();
            afr afrVarA = dpx.a();
            long j = doqVar.a;
            boolean zA = aycVarC.A(j);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (zA || objR == ayb.a) {
                objR = new arp(j, bko.k(bkv.d(j), bkv.c(j), bkv.b(j), 0.4f, bkv.f(j)));
                aygVar.ac(objR);
            }
            ayp aypVar = arq.b;
            long j2 = doqVar.w;
            bay.L(new bag[]{dor.a.b(doqVar), drh.a.b(drfVarI), drw.b.b(drvVar), dpn.a.b(ebnVar), afo.a.b(afrVarA), aypVar.b((arp) objR), djh.b.b(new bkv(j2)), djh.c.b(new bkv(j2))}, bdq.k(-2001372885, new ars(drvVar, uiuVar, 16), aycVarC), aycVarC, 56);
        } else {
            aycVarC.r();
            drfVarI = drfVar;
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new awb(doqVar, drvVar, drfVarI, ebnVar, uiuVar, i, 4);
        }
    }

    public static final ebn l(ayc aycVar) {
        return (ebn) aycVar.e(dpn.a);
    }

    public static void verifySharedLibraryPresent() {
        if (!PresenceHolder.a) {
            throw new IllegalStateException("Could not find wearable shared library classes. Please add <uses-library android:name=\"com.google.android.wearable\" android:required=\"false\" /> to the application manifest");
        }
    }

    public static int version() {
        verifySharedLibraryPresent();
        return VersionHolder.a;
    }
}
