package defpackage;

import android.hardware.camera2.CaptureRequest;
import com.google.android.apps.camera.stats.timing.OneCameraTiming;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kqu implements rvu {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ kqu(paq paqVar, OneCameraTiming oneCameraTiming, kfg kfgVar, int i) {
        this.d = i;
        this.b = paqVar;
        this.a = oneCameraTiming;
        this.c = kfgVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, paq] */
    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        if (this.d == 0) {
            Float f = (Float) ((owf) this.a.a()).dL();
            f.floatValue();
            ArrayList arrayList = new ArrayList(Arrays.asList(new pej(CaptureRequest.SCALER_CROP_REGION, ((kqw) ((owf) this.b.a()).dL()).b), new pej(CaptureRequest.CONTROL_ZOOM_RATIO, f)));
            gzi gziVar = gzo.a;
            return qpt.cj(arrayList);
        }
        this.b.close();
        Object obj2 = this.a;
        mex mexVar = (mex) obj2;
        mexVar.j(meq.ONECAMERA_STARTED);
        OneCameraTiming oneCameraTiming = (OneCameraTiming) obj2;
        oneCameraTiming.b.a();
        oneCameraTiming.b = pbp.a;
        mexVar.close();
        return this.c;
    }

    public /* synthetic */ kqu(uem uemVar, uem uemVar2, hbj hbjVar, int i) {
        this.d = i;
        this.a = uemVar;
        this.b = uemVar2;
        this.c = hbjVar;
    }
}
