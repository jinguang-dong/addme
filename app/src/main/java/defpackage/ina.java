package defpackage;

import android.media.AudioManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ina implements tzt {
    private final tzx a;

    public ina(tzx tzxVar) {
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AudioManager a() {
        AudioManager audioManager = (AudioManager) ((imx) this.a.a()).a(imx.b);
        audioManager.getClass();
        return audioManager;
    }
}
