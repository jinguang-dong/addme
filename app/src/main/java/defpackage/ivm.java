package defpackage;

import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.lasagna.LasagnaCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ivm implements LasagnaCallbacks {
    final /* synthetic */ ivo a;

    public ivm(ivo ivoVar) {
        this.a = ivoVar;
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final void a(int i, int i2, String str, rwc rwcVar) {
        if (i >= 0) {
            ivo ivoVar = this.a;
            ivz ivzVar = (ivz) ivoVar.l.remove(Integer.valueOf(i));
            ivzVar.getClass();
            ivzVar.a(i, i2, str, rwcVar);
        }
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final void f(int i, long j, int i2, String str, ShotMetadata shotMetadata) {
        ivz ivzVar = (ivz) this.a.l.get(Integer.valueOf(i));
        ivzVar.getClass();
        ivzVar.f(i, j, i2, str, shotMetadata);
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final /* synthetic */ void onFinalStatusNative(int i, int i2, String str, byte[] bArr) {
        thu.$default$onFinalStatusNative(this, i, i2, str, bArr);
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final /* synthetic */ void onImageNative(int i, long j, int i2, String str, long j2) {
        f(i, j, a.am(i2), str, new ShotMetadata(j2));
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kmm] */
    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final void onProgress(int i, float f) {
        ivz ivzVar = (ivz) this.a.l.get(Integer.valueOf(i));
        ivzVar.getClass();
        iby ibyVar = ivzVar.h;
        if (ibyVar != null) {
            ibyVar.x.c.a(iwp.t, f);
        } else {
            ((sgt) ivz.a.c().M(2441)).s("Shot has been aborted.");
        }
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final void onPslRequest(int i, boolean z, float f, float f2) {
        ivz ivzVar = (ivz) this.a.l.get(Integer.valueOf(i));
        ivzVar.getClass();
        ivzVar.onPslRequest(i, z, f, f2);
    }
}
