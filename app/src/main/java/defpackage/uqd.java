package defpackage;

import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class uqd extends ujn implements uiv {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqd(Object obj, int i, byte[] bArr) {
        super(3, obj, nhz.class, "updateSliderProgress", "updateSliderProgress(FZLcom/google/android/apps/camera/ui/views/tickmarkslider/api/ProgressListener$Source;)V", 0);
        this.a = i;
    }

    @Override // defpackage.uiv
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        if (this.a != 0) {
            float fFloatValue = ((Number) obj).floatValue();
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            niz nizVar = (niz) obj3;
            nizVar.getClass();
            ((nhz) this.e).g(fFloatValue, zBooleanValue, nizVar);
            return ufg.a;
        }
        Object obj4 = ((uqq) obj2).b;
        uiq uiqVar = ((uqi) this.e).a;
        uiqVar.getClass();
        Object objA = uqq.a(obj4);
        objA.getClass();
        ujk.m(uiqVar, objA, (uhf) obj3);
        return ufg.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqd(Object obj, int i) {
        super(3, obj, uqi.class, "onCancellationChannelResultImplDoNotCall", mNLbzhCxd.hqkAWtsjpC, 0);
        this.a = i;
    }
}
