package defpackage;

import android.media.MediaRecorder;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ozt implements MediaRecorder.OnErrorListener {
    final /* synthetic */ ozu a;

    public ozt(ozu ozuVar) {
        this.a = ozuVar;
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
        if (i == 1) {
            Log.e("VidRecMedRec", a.bv(i2, "MEDIA_RECORDER_ERROR_UNKNOWN: extra="));
        } else if (i == 100) {
            Log.e("VidRecMedRec", a.bv(i2, "MEDIA_ERROR_SERVER_DIED: extra="));
        } else {
            if (i2 == -1007) {
                Log.e("VidRecMedRec", a.bE(i, "MEDIA_ERROR_MALFORMED: what=", " extra=-1007"));
                return;
            }
            Log.e("VidRecMedRec", a.bu(i2, i, "MediaRecorder onError: what=", " extra="));
        }
        this.a.c.a();
    }
}
