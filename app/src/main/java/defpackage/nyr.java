package defpackage;

import android.content.IntentFilter;
import android.widget.VideoView;
import androidx.wear.ambient.AmbientModeSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nyr {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;

    public nyr(far farVar, eyq eyqVar) {
        this.d = new ezd(this);
        this.c = farVar;
        this.b = eyqVar;
    }

    public nyr(nox noxVar) {
        noxVar.getClass();
        this.b = noxVar;
        VideoView videoView = noxVar.f;
        videoView.getClass();
        this.d = videoView;
        this.a = false;
        this.c = new nhp(this, 12);
    }

    public nyr(AmbientModeSupport.AmbientController ambientController) {
        this.d = ambientController;
        IntentFilter intentFilter = new IntentFilter();
        this.b = intentFilter;
        intentFilter.addAction("android.intent.action.TIME_TICK");
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        this.c = new nyq(this);
    }
}
