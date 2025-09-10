package defpackage;

import com.google.android.apps.camera.imax.cyclops.image.CyclopsPhotoWriter;
import com.google.android.apps.camera.imax.cyclops.image.StereoPanorama;
import com.google.geo.lightfield.processing.ProgressCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ilj implements ili {
    static {
        System.loadLibrary("cyclops");
    }

    @Override // defpackage.ili
    public final void a(StereoPanorama stereoPanorama, String str, ProgressCallback progressCallback) {
        progressCallback.setProgress(0.2f);
        CyclopsPhotoWriter.writeToFile(stereoPanorama.a, stereoPanorama.b, stereoPanorama.c, stereoPanorama.d, str);
    }
}
