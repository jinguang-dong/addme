package defpackage;

import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvWriteView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdf extends YuvWriteView {
    final /* synthetic */ YuvImage a;
    private final YuvImage d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdf(YuvWriteView yuvWriteView, YuvImage yuvImage) {
        super(GcamModuleJNI.new_YuvWriteViewBase__SWIG_1(YuvWriteView.c(yuvWriteView), yuvWriteView));
        this.a = yuvImage;
        this.d = yuvImage;
    }
}
