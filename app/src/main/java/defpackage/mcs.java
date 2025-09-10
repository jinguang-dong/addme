package defpackage;

import android.media.AudioManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mcs implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ mct a;

    public mcs(mct mctVar) {
        this.a = mctVar;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        if (i == 1 || i == -3) {
            return;
        }
        mct mctVar = this.a;
        mctVar.f = true;
        mctVar.b();
    }
}
