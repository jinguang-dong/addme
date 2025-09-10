package defpackage;

import android.media.MediaPlayer;
import com.google.android.apps.camera.ui.compositevideoview.CompositeVideoTextureView;
import com.google.android.apps.camera.ui.compositevideoview.CompositeVideoView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mok implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mok(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        int i = this.b;
        if (i == 0) {
            mon monVar = ((CompositeVideoView) this.a).c;
            if (monVar != null) {
                monVar.onCompletion(mediaPlayer);
                return;
            }
            return;
        }
        if (i != 1) {
            nov novVar = ((nou) this.a).b;
            novVar.e();
            novVar.e.c();
        } else {
            mon monVar2 = ((CompositeVideoTextureView) this.a).c;
            if (monVar2 != null) {
                monVar2.onCompletion(mediaPlayer);
            }
        }
    }
}
