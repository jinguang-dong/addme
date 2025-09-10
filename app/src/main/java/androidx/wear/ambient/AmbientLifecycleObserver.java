package androidx.wear.ambient;

import android.content.Context;
import android.database.Cursor;
import android.net.NetworkRequest;
import android.net.Uri;
import android.util.Log;
import android.view.ScrollFeedbackProvider;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.work.impl.WorkDatabase;
import defpackage.a;
import defpackage.aet;
import defpackage.aff;
import defpackage.ajd;
import defpackage.ape;
import defpackage.apg;
import defpackage.ars;
import defpackage.aud;
import defpackage.ayb;
import defpackage.ayc;
import defpackage.ayg;
import defpackage.ayp;
import defpackage.bai;
import defpackage.bay;
import defpackage.bdq;
import defpackage.bfs;
import defpackage.bfx;
import defpackage.bfz;
import defpackage.bgb;
import defpackage.bik;
import defpackage.byi;
import defpackage.cgh;
import defpackage.cij;
import defpackage.cpn;
import defpackage.cvt;
import defpackage.cwy;
import defpackage.dco;
import defpackage.dcu;
import defpackage.dcv;
import defpackage.dfq;
import defpackage.dlc;
import defpackage.dlr;
import defpackage.dmk;
import defpackage.dms;
import defpackage.dmv;
import defpackage.dnb;
import defpackage.dnj;
import defpackage.dvu;
import defpackage.dvx;
import defpackage.dwj;
import defpackage.dxj;
import defpackage.dxl;
import defpackage.dyj;
import defpackage.eay;
import defpackage.ebg;
import defpackage.ebh;
import defpackage.ebl;
import defpackage.ebm;
import defpackage.ebn;
import defpackage.ebx;
import defpackage.eby;
import defpackage.ecr;
import defpackage.ecs;
import defpackage.ecv;
import defpackage.ecy;
import defpackage.jod;
import defpackage.nhz;
import defpackage.ske;
import defpackage.uif;
import defpackage.uiu;
import defpackage.uiv;
import defpackage.ujk;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface AmbientLifecycleObserver extends cvt {

    /* compiled from: PG */
    public final class AmbientDetails {
        private final boolean a;
        private final boolean b;

        public AmbientDetails(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean getBurnInProtectionRequired() {
            return this.a;
        }

        public final boolean getDeviceHasLowBitAmbient() {
            return this.b;
        }

        public final String toString() {
            return "AmbientDetails - burnInProtectionRequired: " + this.a + ", deviceHasLowBitAmbient: " + this.b;
        }
    }

    /* compiled from: PG */
    public interface AmbientLifecycleCallback {

        /* compiled from: PG */
        /* renamed from: androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback$-CC, reason: invalid class name */
        public /* synthetic */ class CC {
            public CC() {
            }

            public static ebm A(ebx ebxVar) {
                ebxVar.getClass();
                return new ebm(ebxVar.b, ebxVar.r);
            }

            public static ebg B(ebm ebmVar, int i) {
                return new ebg(ebmVar.a, ebmVar.b, i);
            }

            public static ebg C(ebh ebhVar, ebm ebmVar) {
                dcu dcuVarA = dcu.a("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
                dcuVarA.g(1, ebmVar.a);
                dcuVarA.e(2, ebmVar.b);
                dco dcoVar = ((ebl) ebhVar).a;
                dcoVar.k();
                Cursor cursorF = cwy.f(dcoVar, dcuVarA);
                try {
                    return cursorF.moveToFirst() ? new ebg(cursorF.getString(cgh.A(cursorF, "work_spec_id")), cursorF.getInt(cgh.A(cursorF, "generation")), cursorF.getInt(cgh.A(cursorF, "system_id"))) : null;
                } finally {
                    cursorF.close();
                    dcuVarA.j();
                }
            }

            public static dnj g(final ajd ajdVar, ayc aycVar) {
                final apg apgVarAP = byi.aP(aycVar);
                ayp aypVar = AndroidCompositionLocals_androidKt.b;
                final boolean zHasSystemFeature = ((Context) aycVar.e(aypVar)).getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
                final ViewConfiguration viewConfiguration = ViewConfiguration.get((Context) aycVar.e(aypVar));
                aycVar.u(1508197357);
                aycVar.u(1572681413);
                View view = (View) aycVar.e(AndroidCompositionLocals_androidKt.f);
                boolean zB = aycVar.B(ajdVar) | aycVar.B(view);
                ayg aygVar = (ayg) aycVar;
                Object objR = aygVar.R();
                if (zB || objR == ayb.a) {
                    objR = new ebn(ajdVar, ScrollFeedbackProvider.createProvider(view));
                    aygVar.ac(objR);
                }
                aygVar.Y();
                aygVar.Y();
                return new dnj(zHasSystemFeature, (ebn) objR, new uiu() { // from class: dnx
                    @Override // defpackage.uiu
                    public final Object a(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj).intValue();
                        long jLongValue = ((Long) obj2).longValue();
                        apg apgVar = apgVarAP;
                        if (apgVar == null) {
                            return null;
                        }
                        return new dno(ajdVar, apgVar, true != zHasSystemFeature ? 30L : 100L, viewConfiguration, iIntValue, jLongValue);
                    }
                }, new dlc(ajdVar, 6));
            }

            public static void h(uiv uivVar, ayc aycVar, int i) {
                int i2;
                int i3 = i & 6;
                ayc aycVarC = aycVar.c(-464765582);
                int i4 = 4;
                if (i3 == 0) {
                    i2 = (true != aycVarC.D(uivVar) ? 2 : 4) | i;
                } else {
                    i2 = i;
                }
                if (aycVarC.H((i2 & 3) != 2, i2 & 1)) {
                    ayp aypVar = bfz.a;
                    bfx bfxVar = (bfx) aycVarC.e(aypVar);
                    bfs bfsVarM = bdq.m(aycVarC);
                    Object[] objArr = {bfxVar};
                    byte[] bArr = null;
                    bgb bgbVar = new bgb(new aud(i4), new aff(bfxVar, bfsVarM, 19, bArr));
                    boolean zD = aycVarC.D(bfxVar) | aycVarC.D(bfsVarM);
                    ayg aygVar = (ayg) aycVarC;
                    Object objR = aygVar.R();
                    if (zD || objR == ayb.a) {
                        objR = new aet(bfxVar, bfsVarM, 11, bArr);
                        aygVar.ac(objR);
                    }
                    dnb dnbVar = (dnb) bdq.p(objArr, bgbVar, (uif) objR, aycVarC, 0, 4);
                    bay.K(aypVar.b(dnbVar), bdq.k(-969715150, new ars(uivVar, dnbVar, 14, null), aycVarC), aycVarC, 56);
                } else {
                    aycVarC.r();
                }
                bai baiVarI = aycVarC.I();
                if (baiVarI != null) {
                    baiVarI.d = new ape(uivVar, i, i4);
                }
            }

            public static dmk i(Object obj) {
                if (obj instanceof dmk) {
                    return (dmk) obj;
                }
                return null;
            }

            public static boolean j(dlr dlrVar) {
                for (int i = 0; i <= 0; i++) {
                    if (i(dlrVar.d()) != null) {
                        return true;
                    }
                }
                return false;
            }

            public static void k(uif uifVar, bik bikVar, AmbientDelegate ambientDelegate, uiu uiuVar, ayc aycVar, int i) {
                int i2;
                int i3 = i & 6;
                ayc aycVarC = aycVar.c(-1635552096);
                if (i3 == 0) {
                    i2 = (true != aycVarC.D(uifVar) ? 2 : 4) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= true != aycVarC.B(bikVar) ? 16 : 32;
                }
                if ((i & 384) == 0) {
                    i2 |= true != aycVarC.B(ambientDelegate) ? 128 : 256;
                }
                if ((i & 3072) == 0) {
                    i2 |= true != aycVarC.D(uiuVar) ? 1024 : 2048;
                }
                if (aycVarC.H((i2 & 1171) != 1170, i2 & 1)) {
                    h(bdq.k(-1190768520, new dmv(ambientDelegate, bikVar, uiuVar, byi.ah(uifVar, aycVarC), 0), aycVarC), aycVarC, 6);
                } else {
                    aycVarC.r();
                }
                bai baiVarI = aycVarC.I();
                if (baiVarI != null) {
                    baiVarI.d = new dms(uifVar, bikVar, ambientDelegate, uiuVar, i, 0);
                }
            }

            public static ebx l(List list, ebx ebxVar) {
                list.getClass();
                boolean zC = ebxVar.e.c("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
                boolean zC2 = ebxVar.e.c("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
                boolean zC3 = ebxVar.e.c("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
                if (zC || !zC2 || !zC3) {
                    return ebxVar;
                }
                String str = ebxVar.c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                dvx dvxVar = ebxVar.e;
                dvxVar.getClass();
                cij.t(dvxVar.b, linkedHashMap);
                cij.u("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str, linkedHashMap);
                return ebx.e(ebxVar, null, 0, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", cij.s(linkedHashMap), 0, 0L, 0, 0, 0L, 0, 33554411);
            }

            public static void m(dyj dyjVar, String str) {
                nhz nhzVarD;
                WorkDatabase workDatabase = dyjVar.d;
                workDatabase.getClass();
                eby ebyVarB = workDatabase.B();
                eay eayVarW = workDatabase.w();
                List listBn = ske.bn(str);
                while (!listBn.isEmpty()) {
                    String str2 = (String) ske.bt(listBn);
                    int iL = ebyVarB.l(str2);
                    if (iL != 3 && iL != 4) {
                        ecr ecrVar = (ecr) ebyVarB;
                        dco dcoVar = ecrVar.a;
                        dcoVar.k();
                        dcv dcvVar = ecrVar.d;
                        dfq dfqVarD = dcvVar.d();
                        dfqVarD.g(1, str2);
                        try {
                            dcoVar.l();
                            try {
                                dfqVarD.a();
                                dcoVar.p();
                                dcoVar.n();
                                dcvVar.f(dfqVarD);
                            } finally {
                            }
                        } catch (Throwable th) {
                            ecrVar.d.f(dfqVarD);
                            throw th;
                        }
                    }
                    listBn.addAll(eayVarW.a(str2));
                }
                dxj dxjVar = dyjVar.f;
                dxjVar.getClass();
                synchronized (dxjVar.f) {
                    dwj.b();
                    dxjVar.d.add(str);
                    nhzVarD = dxjVar.d(str);
                }
                dxj.f(nhzVarD, 1);
                Iterator it = dyjVar.e.iterator();
                while (it.hasNext()) {
                    ((dxl) it.next()).b(str);
                }
            }

            public static ecy n(byte[] bArr) {
                bArr.getClass();
                if (bArr.length == 0) {
                    return new ecy((Object) null);
                }
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int i = objectInputStream.readInt();
                        int[] iArr = new int[i];
                        for (int i2 = 0; i2 < i; i2++) {
                            iArr[i2] = objectInputStream.readInt();
                        }
                        int i3 = objectInputStream.readInt();
                        int[] iArr2 = new int[i3];
                        for (int i4 = 0; i4 < i3; i4++) {
                            iArr2[i4] = objectInputStream.readInt();
                        }
                        NetworkRequest.Builder builder = new NetworkRequest.Builder();
                        for (int i5 = 0; i5 < i3; i5++) {
                            int i6 = iArr2[i5];
                            try {
                                builder.addCapability(i6);
                            } catch (IllegalArgumentException e) {
                                dwj.b();
                                Log.w(ecy.a, "Ignoring adding capability '" + i6 + '\'', e);
                            }
                        }
                        for (int i7 = 0; i7 < i; i7++) {
                            builder.addTransportType(iArr[i7]);
                        }
                        NetworkRequest networkRequestBuild = builder.build();
                        networkRequestBuild.getClass();
                        ecy ecyVar = new ecy(networkRequestBuild);
                        ujk.e(objectInputStream, null);
                        ujk.e(byteArrayInputStream, null);
                        return ecyVar;
                    } finally {
                    }
                } finally {
                }
            }

            public static Set o(byte[] bArr) {
                bArr.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (bArr.length == 0) {
                    return linkedHashSet;
                }
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    try {
                        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                        try {
                            int i = objectInputStream.readInt();
                            for (int i2 = 0; i2 < i; i2++) {
                                Uri uri = Uri.parse(objectInputStream.readUTF());
                                boolean z = objectInputStream.readBoolean();
                                uri.getClass();
                                linkedHashSet.add(new dvu(uri, z));
                            }
                            ujk.e(objectInputStream, null);
                        } finally {
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    ujk.e(byteArrayInputStream, null);
                    return linkedHashSet;
                } finally {
                }
            }

            public static byte[] p(ecy ecyVar) {
                Object obj = ecyVar.b;
                if (obj == null) {
                    return new byte[0];
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        int[] transportTypes = ((NetworkRequest) obj).getTransportTypes();
                        transportTypes.getClass();
                        int[] capabilities = ((NetworkRequest) obj).getCapabilities();
                        capabilities.getClass();
                        objectOutputStream.writeInt(transportTypes.length);
                        for (int i : transportTypes) {
                            objectOutputStream.writeInt(i);
                        }
                        objectOutputStream.writeInt(capabilities.length);
                        for (int i2 : capabilities) {
                            objectOutputStream.writeInt(i2);
                        }
                        ujk.e(objectOutputStream, null);
                        ujk.e(byteArrayOutputStream, null);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArray.getClass();
                        return byteArray;
                    } finally {
                    }
                } finally {
                }
            }

            public static byte[] q(Set set) {
                if (set.isEmpty()) {
                    return new byte[0];
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeInt(set.size());
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            dvu dvuVar = (dvu) it.next();
                            objectOutputStream.writeUTF(dvuVar.a.toString());
                            objectOutputStream.writeBoolean(dvuVar.b);
                        }
                        ujk.e(objectOutputStream, null);
                        ujk.e(byteArrayOutputStream, null);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArray.getClass();
                        return byteArray;
                    } finally {
                    }
                } finally {
                }
            }

            public static int r(int i) {
                if (i != 0) {
                    return i + (-1) != 0 ? 1 : 0;
                }
                throw null;
            }

            public static int s(int i) {
                int i2 = i - 1;
                if (i2 == 0) {
                    return 0;
                }
                int i3 = 1;
                if (i2 != 1) {
                    i3 = 2;
                    if (i2 != 2) {
                        i3 = 3;
                        if (i2 != 3) {
                            i3 = 4;
                            if (i2 != 4) {
                                if (i == 6) {
                                    return 5;
                                }
                                throw new IllegalArgumentException("Could not convert " + ((Object) cpn.x(i)) + " to int");
                            }
                        }
                    }
                }
                return i3;
            }

            public static int t(int i) {
                if (i != 0) {
                    return i + (-1) != 0 ? 1 : 0;
                }
                throw null;
            }

            public static int u(int i) {
                if (i == 0) {
                    throw null;
                }
                int i2 = i - 1;
                if (i2 == 0) {
                    return 0;
                }
                int i3 = 1;
                if (i2 != 1) {
                    i3 = 2;
                    if (i2 != 2) {
                        i3 = 3;
                        if (i2 != 3) {
                            i3 = 4;
                            if (i2 != 4) {
                                return 5;
                            }
                        }
                    }
                }
                return i3;
            }

            public static int v(int i) {
                if (i == 0) {
                    return 1;
                }
                if (i == 1) {
                    return 2;
                }
                throw new IllegalArgumentException(a.bE(i, "Could not convert ", " to BackoffPolicy"));
            }

            public static int w(int i) {
                if (i == 0) {
                    return 1;
                }
                if (i == 1) {
                    return 2;
                }
                if (i == 2) {
                    return 3;
                }
                if (i == 3) {
                    return 4;
                }
                if (i == 4) {
                    return 5;
                }
                if (i == 5) {
                    return 6;
                }
                throw new IllegalArgumentException(a.bE(i, "Could not convert ", " to NetworkType"));
            }

            public static int x(int i) {
                if (i == 0) {
                    return 1;
                }
                if (i == 1) {
                    return 2;
                }
                throw new IllegalArgumentException(a.bE(i, "Could not convert ", " to OutOfQuotaPolicy"));
            }

            public static int y(int i) {
                if (i == 0) {
                    return 1;
                }
                if (i == 1) {
                    return 2;
                }
                if (i == 2) {
                    return 3;
                }
                if (i == 3) {
                    return 4;
                }
                if (i == 4) {
                    return 5;
                }
                if (i == 5) {
                    return 6;
                }
                throw new IllegalArgumentException(a.bE(i, "Could not convert ", " to State"));
            }

            public static void z(ecs ecsVar, String str, Set set) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    jod jodVar = new jod((String) it.next(), str, (byte[]) null);
                    ecv ecvVar = (ecv) ecsVar;
                    dco dcoVar = ecvVar.a;
                    dcoVar.k();
                    dcoVar.l();
                    try {
                        ((ecv) ecsVar).b.a(jodVar);
                        dcoVar.p();
                        dcoVar.n();
                    } catch (Throwable th) {
                        ecvVar.a.n();
                        throw th;
                    }
                }
            }

            public void c(int i) {
                throw null;
            }

            public boolean f(int i) {
                throw null;
            }

            public CC(byte[] bArr, byte[] bArr2) {
            }

            public static void $default$onExitAmbient(AmbientLifecycleCallback ambientLifecycleCallback) {
            }

            public static void $default$onUpdateAmbient(AmbientLifecycleCallback ambientLifecycleCallback) {
            }

            public void a(int i) {
            }

            public void b(int i, float f, int i2) {
            }
        }

        void onEnterAmbient(AmbientDetails ambientDetails);

        void onExitAmbient();

        void onUpdateAmbient();
    }

    boolean isAmbient();
}
