package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.camera.videoplayer.VideoPlayerActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nny extends BroadcastReceiver {
    final /* synthetic */ VideoPlayerActivity a;

    public nny(VideoPlayerActivity videoPlayerActivity) {
        this.a = videoPlayerActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.finish();
    }
}
