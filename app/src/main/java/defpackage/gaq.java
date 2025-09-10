package defpackage;

import android.util.Range;
import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gaq extends gaw {
    public gaq(pjr pjrVar, pjr pjrVar2, iso isoVar, oxh oxhVar, oxj oxjVar, rwc rwcVar, pas pasVar, oxp oxpVar, rwc rwcVar2, rwc rwcVar3, rwc rwcVar4, rwc rwcVar5, rwc rwcVar6, boolean z, Range range, Range range2, Range range3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, sbp sbpVar, sbp sbpVar2, sbp sbpVar3, pka pkaVar, ltf ltfVar, int i, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, ggn ggnVar, boolean z18, boolean z19, boolean z20, rwc rwcVar7, rwc rwcVar8, boolean z21, nkw nkwVar, boolean z22, boolean z23, gax gaxVar) {
        super(pjrVar, pjrVar2, isoVar, oxhVar, oxjVar, rwcVar, pasVar, oxpVar, rwcVar2, rwcVar3, rwcVar4, rwcVar5, rwcVar6, z, range, range2, range3, z2, z3, z4, z5, z6, z7, z8, z9, sbpVar, sbpVar2, sbpVar3, pkaVar, ltfVar, i, z10, z11, z12, z13, z14, z15, z16, z17, ggnVar, z18, z19, z20, rwcVar7, rwcVar8, z21, nkwVar, z22, z23, gaxVar);
    }

    private static String a(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        return sb.toString();
    }

    private static String b(Object obj, int i) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n".concat(a(i)));
    }

    private static String c(Collection collection) {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            oxh oxhVar = (oxh) it.next();
            sb.append("\n");
            sb.append(a(2));
            sb.append(b(oxhVar, 2));
            sb.append(",");
            z = true;
        }
        if (z) {
            sb.append("\n");
            sb.append(a(1));
        }
        sb.append("]");
        return sb.toString();
    }

    private static String d(rwc rwcVar) {
        return rwcVar.h() ? b(rwcVar.c(), 1) : "<absent>";
    }

    private static String e(rwc rwcVar) {
        return rwcVar.h() ? b(rwcVar.c(), 1) : "<absent>";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gaw
    public final String toString() {
        pjr pjrVar = this.a;
        rwc rwcVar = this.h;
        boolean zH = rwcVar.h();
        String strB = b(pjrVar, 1);
        String strB2 = b(this.b, 1);
        String strB3 = b(this.X, 1);
        String strB4 = b(this.c, 1);
        String strB5 = b(this.d, 1);
        String strE = e(this.e);
        String strB6 = b(this.f, 1);
        String strB7 = b(this.g, 1);
        String strB8 = zH ? b(rwcVar.c(), 1) : "<absent>";
        rwc rwcVar2 = this.i;
        String strB9 = rwcVar2.h() ? b(rwcVar2.c(), 1) : "<absent>";
        rwc rwcVar3 = this.j;
        String strB10 = rwcVar3.h() ? b(rwcVar3.c(), 1) : "<absent>";
        rwc rwcVar4 = this.k;
        String strB11 = rwcVar4.h() ? b(rwcVar4.c(), 1) : "<absent>";
        rwc rwcVar5 = this.l;
        boolean z = this.m;
        Range range = this.n;
        String strD = d(rwcVar5);
        String strB12 = b(range, 1);
        String strB13 = b(this.o, 1);
        String strB14 = b(this.p, 1);
        boolean z2 = this.q;
        boolean z3 = this.r;
        boolean z4 = this.s;
        boolean z5 = this.t;
        boolean z6 = this.u;
        boolean z7 = this.v;
        boolean z8 = this.w;
        boolean z9 = this.x;
        sbp sbpVar = this.y;
        sbp sbpVar2 = this.z;
        sbp sbpVar3 = this.A;
        String strC = c(sbpVar);
        String strC2 = c(sbpVar2);
        StringBuilder sb = new StringBuilder("[");
        sgk it = sbpVar3.iterator();
        boolean z10 = false;
        while (true) {
            sgk sgkVar = it;
            if (!it.hasNext()) {
                break;
            }
            String str = strD;
            oxj oxjVar = (oxj) sgkVar.next();
            sb.append("\n");
            sb.append(a(2));
            sb.append(b(oxjVar, 2));
            sb.append(",");
            z10 = true;
            strD = str;
            it = sgkVar;
            strB11 = strB11;
        }
        String str2 = strB11;
        String str3 = strD;
        if (z10) {
            sb.append("\n");
            sb.append(a(1));
        }
        sb.append("]");
        String string = sb.toString();
        String strB15 = b(this.B, 1);
        String strB16 = b(this.C, 1);
        int i = this.D;
        boolean z11 = this.E;
        boolean z12 = this.F;
        boolean z13 = this.G;
        boolean z14 = this.H;
        boolean z15 = this.I;
        boolean z16 = this.J;
        boolean z17 = this.K;
        boolean z18 = this.L;
        String strB17 = b(this.M, 1);
        boolean z19 = this.N;
        boolean z20 = this.O;
        boolean z21 = this.P;
        rwc rwcVar6 = this.Q;
        rwc rwcVar7 = this.R;
        boolean z22 = this.S;
        nkw nkwVar = this.T;
        return "CaptureSessionConfig {\n  cameraId = " + strB + ",\n  streamCameraId = " + strB2 + ",\n  camcorderCharacteristics = " + strB3 + ",\n  captureRate = " + strB4 + ",\n  videoResolution = " + strB5 + mPfBwqXsnpXI.evlECpxgnDeBz + strE + ",\n  previewSize = " + strB6 + ",\n  videoEncoderProfile = " + strB7 + ",\n  secondaryVideoEncoderProfile = " + strB8 + ",\n  audioEncoderProfile = " + strB9 + ",\n  uri = " + strB10 + ",\n  maxDuration = " + str2 + ",\n  maxFileSize = " + str3 + ",\n  shouldRecordLocationIfPermitted = " + z + ",\n  previewThrottleFpsRange = " + strB12 + ",\n  previewFpsRange = " + strB13 + ",\n  recordFpsRange = " + strB14 + ",\n  useContinuousAutoFocusOnDuringRecording = " + z2 + ",\n  previewThrottleFps = " + z3 + ",\n  thermalThrottleFps = " + z4 + ",\n  shouldUnlockAfAeWithSceneChange = " + z5 + ",\n  shouldDetectFace = " + z6 + ",\n  shouldVideoStabilizationOn = " + z7 + ",\n  useOpticalStabilization = " + z8 + ",\n  useLlv = " + z9 + ",\n  allSupportedCaptureRates = " + strC + ",\n  supportedCaptureRates = " + strC2 + ",\n  supportedVideoResolutions = " + string + ",\n  cameraFacing = " + strB15 + ",\n  captureSessionType = " + strB16 + ",\n  sessionId = " + i + ",\n  useMediaCodec = " + z11 + ",\n  topShotEnabled = " + z12 + ",\n  shouldSupportSpeechMode = " + z13 + ",\n  viewfinderEffectEnabled = " + z14 + ",\n  videoEffectEnabled = false,\n  amberEnabled = " + z15 + ",\n  amethystEnabled = " + z16 + ",\n  macroFocusEnabled = " + z17 + ",\n  emeraldEnabled = false,\n  featureCentralEnabled = false,\n  sapphireEnabled = " + z18 + ",\n  p11ZoomConfig = " + strB17 + ",\n  audioZoomEnabled = " + z19 + ",\n  trackingEnabled = " + z20 + ",\n  lowResYuvStreamEnabled = " + z21 + ",\n  lowResYuvStreamSize = " + e(rwcVar6) + ",\n  alternateLowStorageThreshold = " + d(rwcVar7) + ",\n  fossilEnabled = " + z22 + ",\n  dataStreamEnabled = false,\n  mode = " + b(nkwVar, 1) + ",\n  stabilizationModesSupported = " + this.U + ",\n  underwaterColorEnabled = " + this.V + ",\n  p11Config = " + b(this.W, 1) + ",\n}";
    }
}
