package defpackage;

import android.graphics.SurfaceTexture;
import com.google.android.libraries.vision.opengl.Texture;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rfu implements SurfaceTexture.OnFrameAvailableListener {
    public static final String a = "rfu";
    public final Texture b;
    public final SurfaceTexture c;
    public final Semaphore d = new Semaphore(0);

    public rfu(int i, int i2) {
        Texture texture = new Texture(i, i2, 36197);
        this.b = texture;
        SurfaceTexture surfaceTexture = new SurfaceTexture(texture.getName());
        this.c = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.d.release();
    }
}
