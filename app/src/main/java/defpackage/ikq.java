package defpackage;

import com.google.android.apps.camera.imax.cyclops.processing.NativeCaptureImpl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikq implements iks {
    public static int a = 8192;
    public static float b = 60.0f;

    @Override // defpackage.iks
    public final ikr a() {
        return new NativeCaptureImpl(a, b);
    }
}
