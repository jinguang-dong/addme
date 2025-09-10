package defpackage;

import android.hardware.HardwareBuffer;
import android.hardware.camera2.CaptureResult;
import android.location.Location;
import android.media.MediaFormat;
import com.google.android.apps.camera.moments.FastMomentsHdrImpl;
import com.google.android.apps.camera.moments.MomentsUtils;
import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.ClientShotMetadata;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageF;
import com.google.googlex.gcam.LocationData;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.SpatialGainMap;
import com.google.googlex.gcam.StaticMetadata;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jys implements kbr {
    private static final AtomicInteger b = new AtomicInteger(0);
    public final jzx a;
    private final pbc c;
    private final MediaFormat d;
    private final MediaFormat e;
    private final long f;
    private final lat g;
    private final rwc h;
    private final rwc i;
    private final FastMomentsHdrImpl j;
    private final hbj k;
    private final ree l;

    public jys(ree reeVar, FastMomentsHdrImpl fastMomentsHdrImpl, pbc pbcVar, hbj hbjVar, jzx jzxVar, MediaFormat mediaFormat, MediaFormat mediaFormat2, long j, lat latVar, rwc rwcVar, rwc rwcVar2) {
        this.l = reeVar;
        this.j = fastMomentsHdrImpl;
        this.c = pbcVar.a(jzv.class.getSimpleName());
        this.k = hbjVar;
        this.a = jzxVar;
        this.d = mediaFormat;
        this.e = mediaFormat2;
        this.f = j;
        this.g = latVar;
        this.h = rwcVar;
        this.i = rwcVar2;
    }

    private static int d(boolean z, boolean z2) {
        if (z) {
            return z2 ? 2 : 1;
        }
        return 0;
    }

    @Override // defpackage.kbr
    public final int a() {
        return 1;
    }

    @Override // defpackage.kbr
    public final boolean c(pdk pdkVar, lat latVar) {
        poj pojVarP = latVar.a(pdkVar).p();
        FastMomentsHdrImpl fastMomentsHdrImpl = this.j;
        try {
            if (pojVarP == null) {
                fastMomentsHdrImpl.a.d("No RAW10 image found in frame. Can't use FastMomentsHdr");
                return false;
            }
            HardwareBuffer hardwareBufferF = pojVarP.f();
            boolean z = hardwareBufferF != null;
            if (hardwareBufferF != null) {
                hardwareBufferF.close();
            }
            pojVarP.close();
            return z;
        } catch (Throwable th) {
            if (pojVarP != null) {
                try {
                    pojVarP.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [hzs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, jid] */
    @Override // defpackage.kbr
    public final void b(pdk pdkVar, kfl kflVar, int i, kbz kbzVar, kbq kbqVar) throws Throwable {
        pkf pkfVar;
        Throwable th;
        pkf pkfVar2;
        Throwable th2;
        jyr jyrVar;
        ClientShotMetadata clientShotMetadata;
        ShotMetadata shotMetadata;
        pas pasVar;
        int iD;
        kbz kbzVar2;
        int i2;
        pbg pbgVar = new pbg(this.c, "fast launcher shot " + b.getAndIncrement() + " ");
        pbgVar.b("launcher got a HDR+ burst");
        pdo pdoVarB = pdkVar.b();
        pdoVarB.getClass();
        pbgVar.b("    with frame: " + pdoVarB.b);
        try {
            poe poeVar = (poe) ((swn) MomentsUtils.a(pdkVar)).t(5000L, TimeUnit.MILLISECONDS);
            pdo pdoVarB2 = pdkVar.b();
            pdoVarB2.getClass();
            lau lauVarA = this.g.a(pdkVar);
            poj pojVarP = lauVarA.p();
            poj pojVarO = lauVarA.o();
            long j = pdoVarB2.b;
            if (pojVarO == null) {
                pojVarO = new pke(j);
            }
            pdkVar.close();
            if (pojVarP == null) {
                kbqVar.b(new RuntimeException("Could not get a raw image from input frame"));
                return;
            }
            pkf pkfVar3 = new pkf(pojVarP, 1);
            try {
                try {
                    pkf pkfVar4 = new pkf(pojVarO, 1);
                    try {
                        pbgVar.b("Acquired frame metadata successfully.");
                        poj pojVarK = pkfVar4.k();
                        if (pojVarK == null) {
                            try {
                                pbgVar.d("Failed to fork PD image");
                                try {
                                    pkfVar4.l();
                                    pkfVar3.l();
                                    return;
                                } catch (Throwable th3) {
                                    th = th3;
                                    pkfVar = pkfVar3;
                                    try {
                                        pkfVar.l();
                                        throw th;
                                    } catch (Throwable th4) {
                                        th.addSuppressed(th4);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th5) {
                                th2 = th5;
                                pkfVar = pkfVar3;
                                pkfVar2 = pkfVar4;
                                try {
                                    pkfVar2.l();
                                    throw th2;
                                } catch (Throwable th6) {
                                    th2.addSuppressed(th6);
                                    throw th2;
                                }
                            }
                        }
                        try {
                            jyrVar = new jyr(this, pkfVar3, kbzVar, j, poeVar, pojVarO, pojVarK, kbqVar, pbgVar);
                            pkfVar = pkfVar3;
                        } catch (Throwable th7) {
                            th = th7;
                            pkfVar = pkfVar3;
                        }
                        try {
                            ree reeVar = this.l;
                            pjr pjrVarD = lauVarA.l().d();
                            ?? r3 = reeVar.e;
                            int iC = r3.c(poeVar, pjrVarD);
                            StaticMetadata staticMetadataB = ((Gcam) reeVar.g).b(iC);
                            ShotMetadata shotMetadata2 = new ShotMetadata();
                            GcamModuleJNI.ShotMetadata_static_metadata_set(shotMetadata2.a, shotMetadata2, StaticMetadata.c(staticMetadataB), staticMetadataB);
                            FrameMetadata frameMetadataG = r3.g(poeVar, pjrVarD, false);
                            GcamModuleJNI.ShotMetadata_frame_metadata_set(shotMetadata2.a, shotMetadata2, FrameMetadata.c(frameMetadataG), frameMetadataG);
                            Object obj = reeVar.b;
                            SpatialGainMap spatialGainMapU = ((tgq) obj).u(poeVar);
                            InterleavedImageF interleavedImageF = new InterleavedImageF(GcamModuleJNI.SpatialGainMap_gain_map(spatialGainMapU.a, spatialGainMapU), false);
                            GcamModuleJNI.ShotMetadata_gain_map_rggb_set(shotMetadata2.a, shotMetadata2, InterleavedImageF.a(interleavedImageF), interleavedImageF);
                            rwc rwcVarD = reeVar.a.d();
                            if (rwcVarD.h()) {
                                Location location = (Location) rwcVarD.c();
                                LocationData locationData = new LocationData();
                                pkfVar2 = pkfVar4;
                                try {
                                    locationData.b(location.getAltitude());
                                    locationData.c(location.getAccuracy());
                                    locationData.d(location.getLatitude());
                                    locationData.e(location.getLongitude());
                                    locationData.g(location.getTime() / 1000);
                                    locationData.f(location.getProvider());
                                    clientShotMetadata = new ClientShotMetadata();
                                    clientShotMetadata.c(locationData);
                                } catch (Throwable th8) {
                                    th = th8;
                                    th2 = th;
                                    pkfVar2.l();
                                    throw th2;
                                }
                            } else {
                                pkfVar2 = pkfVar4;
                                clientShotMetadata = null;
                            }
                            ClientShotMetadata clientShotMetadata2 = clientShotMetadata;
                            if (clientShotMetadata2 != null) {
                                GcamModuleJNI.ShotMetadata_client_shot_metadata_set(shotMetadata2.a, shotMetadata2, ClientShotMetadata.a(clientShotMetadata2), clientShotMetadata2);
                                shotMetadata = shotMetadata2;
                            } else {
                                shotMetadata = shotMetadata2;
                            }
                            Integer num = (Integer) poeVar.a(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
                            float fA = num != null ? ((tgq) obj).a(num.intValue()) : 1.0f;
                            GcamModuleJNI.ShotMetadata_exposure_compensation_set(shotMetadata.a, shotMetadata, fA);
                            shotMetadata.i(ske.o(i));
                            GcamModuleJNI.ShotMetadata_wb_mode_set(shotMetadata.a, shotMetadata, (((owx) reeVar.c).dL() == kgj.AUTO ? tdc.a : tdc.b).c);
                            GcamModuleJNI.ShotMetadata_flash_mode_set(shotMetadata.a, shotMetadata, tbz.c.d);
                            shotMetadata.k("f");
                            String str = pjrVarD.a;
                            AeShotParams aeShotParams = new AeShotParams();
                            aeShotParams.i(fA);
                            aeShotParams.o(tda.a);
                            str.getClass();
                            ((tgq) obj).B(pjr.b(str), aeShotParams, poeVar, ((Float) ((hbj) reeVar.d).e(gze.a).get()).floatValue(), ((kqp) reeVar.f).b);
                            kbk kbkVar = new kbk(shotMetadata, iC, aeShotParams, spatialGainMapU);
                            boolean z = kflVar.h;
                            if (z) {
                                MediaFormat mediaFormat = this.e;
                                pasVar = new pas(mediaFormat.getInteger("width"), mediaFormat.getInteger("height"));
                            } else {
                                MediaFormat mediaFormat2 = this.d;
                                pasVar = new pas(mediaFormat2.getInteger("width"), mediaFormat2.getInteger("height"));
                            }
                            pas pasVar2 = pasVar;
                            if (z) {
                                hbj hbjVar = this.k;
                                iD = d(hbjVar.p(haa.B) && !hbjVar.p(haa.X), hbjVar.p(haa.C));
                            } else {
                                gzi gziVar = haa.a;
                                iD = d(false, false);
                            }
                            int i3 = iD;
                            hbj hbjVar2 = this.k;
                            boolean zP = hbjVar2.p(haa.H);
                            if (!zP) {
                                kbzVar2 = kbzVar;
                                i2 = 3;
                            } else if (hbjVar2.p(haa.af)) {
                                kbzVar2 = kbzVar;
                                i2 = 2;
                            } else {
                                kbzVar2 = kbzVar;
                                i2 = 1;
                            }
                            int i4 = (kbzVar2.a && this.h.h()) ? 3 : i2;
                            rwc rwcVar = this.i;
                            tco tcoVar = (rwcVar.h() && ((mwq) rwcVar.c()).A()) ? tco.b : tco.a;
                            kbj kbjVar = new kbj(pasVar2, i3, i4, tcoVar, zP ? 0L : this.f);
                            int i5 = i4;
                            poj pojVarK2 = pkfVar.k();
                            if (pojVarK2 == null) {
                                pbgVar.d("Failed to fork raw image");
                                pkfVar2.l();
                                pkfVar.l();
                                return;
                            }
                            FastMomentsHdrImpl fastMomentsHdrImpl = this.j;
                            rnt.G(pojVarK2.a() == 37 || pojVarK2.a() == 38, "Wrong format for input ImageProxy. Got %s, expected RAW10 or RAW12 (%s)", pojVarK2.a(), 37);
                            HardwareBuffer hardwareBufferF = pojVarK2.f();
                            hardwareBufferF.getClass();
                            pas pasVar3 = kbjVar.a;
                            rnt.B(pasVar3.a % 4 == 0, "Only multiple of 4 widths are supported!");
                            rnt.B(pasVar3.b % 2 == 0, "Only multiple of 2 heights are supported!");
                            fastMomentsHdrImpl.d.execute(new jqk(fastMomentsHdrImpl, pojVarK2, kbkVar, ((AeShotParams) kbkVar.c).b(), (ShotMetadata) kbkVar.b, kbjVar, hardwareBufferF, jyrVar, 2));
                            pbgVar.b(mn.f(tcoVar.f, i5 != 1 ? i5 != 2 ? "YUV_IMAGE" : "YUV_HARDWARE_BUFFER" : "RGBA_HARDWARE_BUFFER", "launched FastMomentsHdr shot, outputFormat = ", ", outputColorSpace = "));
                            pkfVar2.l();
                            pkfVar.l();
                        } catch (Throwable th9) {
                            th = th9;
                            pkfVar2 = pkfVar4;
                            th2 = th;
                            pkfVar2.l();
                            throw th2;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        pkfVar = pkfVar3;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    pkfVar = pkfVar3;
                    th = th;
                    pkfVar.l();
                    throw th;
                }
            } catch (Throwable th12) {
                th = th12;
                th = th;
                pkfVar.l();
                throw th;
            }
        } catch (InterruptedException e) {
            pbgVar.d(CGlJpiVWrCQOq.BujStO);
            pdkVar.close();
            kbqVar.b(e);
        } catch (ExecutionException e2) {
            pbgVar.d("Failed to acquire metadata from the first frame.");
            pdkVar.close();
            kbqVar.b(e2);
        } catch (TimeoutException e3) {
            pbgVar.d("Timed out waiting for metadata.");
            pdkVar.close();
            kbqVar.b(e3);
        }
    }
}
