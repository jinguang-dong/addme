package defpackage;

import com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class uqc extends ujn implements uiv {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqc(Object obj, int i, byte[] bArr) {
        super(3, obj, gwv.class, "onSliderProgressUpdate", "onSliderProgressUpdate$java_com_google_android_apps_camera_composezoom_composezoom(FZLcom/google/android/apps/camera/ui/views/tickmarkslider/api/ProgressListener$Source;)V", 0);
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, utj] */
    @Override // defpackage.uiv
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        Float fV;
        if (this.a == 0) {
            uiq uiqVar = ((uqi) this.e).a;
            uiqVar.getClass();
            ujk.m(uiqVar, obj2, (uhf) obj3);
            return ufg.a;
        }
        float fFloatValue = ((Number) obj).floatValue();
        ((Boolean) obj2).booleanValue();
        niz nizVar = (niz) obj3;
        nizVar.getClass();
        gwv gwvVar = (gwv) this.e;
        gvk gvkVar = (gvk) gwvVar.S.h.c();
        if (gvkVar != null) {
            fV = gsn.V(fFloatValue, gvkVar.d, gvkVar.e, gwvVar.U);
            if (fV != null) {
                fV.floatValue();
            }
            return ufg.a;
        }
        fV = null;
        if (fV != null) {
            gwvVar.v(fV.floatValue(), Float.valueOf(fFloatValue), nizVar);
        }
        return ufg.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqc(Object obj, int i) {
        super(3, obj, uqi.class, GAQqzWiWWcYOgy.kKMHHz, "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        this.a = i;
    }
}
