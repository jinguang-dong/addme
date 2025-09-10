package defpackage;

import android.media.MediaPlayer;
import com.google.android.apps.camera.ui.compositevideoview.CompositeVideoTextureView;
import com.google.android.apps.camera.ui.compositevideoview.CompositeVideoView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mol implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mol(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        int i = this.b;
        if (i == 0) {
            mon monVar = ((CompositeVideoView) this.a).c;
            if (monVar != null) {
                monVar.onPrepared(mediaPlayer);
                return;
            }
            return;
        }
        if (i == 1) {
            mon monVar2 = ((CompositeVideoTextureView) this.a).c;
            if (monVar2 != null) {
                monVar2.onPrepared(mediaPlayer);
                return;
            }
            return;
        }
        nov novVar = ((nou) this.a).b;
        mediaPlayer.setLooping(novVar.j);
        if (novVar.i) {
            novVar.fb();
        } else {
            novVar.h();
        }
    }
}
