package defpackage;

import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.YuvWriteView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tde extends YuvReadView {
    final /* synthetic */ Object c;
    private final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tde(YuvReadView yuvReadView, YuvWriteView yuvWriteView) {
        super(yuvReadView);
        this.c = yuvWriteView;
        this.d = yuvWriteView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tde(YuvReadView yuvReadView, YuvImage yuvImage) {
        super(yuvReadView);
        this.c = yuvImage;
        this.d = yuvImage;
    }
}
