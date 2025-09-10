package defpackage;

import android.media.SoundPool;
import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mbn implements SoundPool.OnLoadCompleteListener {
    final /* synthetic */ mbq a;

    public mbn(mbq mbqVar) {
        this.a = mbqVar;
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
        mbq mbqVar = this.a;
        Object obj = mbqVar.b;
        synchronized (obj) {
            if (mbqVar.d) {
                return;
            }
            synchronized (obj) {
                for (mbp mbpVar : mbqVar.c.values()) {
                    if (mbpVar.a == i) {
                        ggg gggVar = mbpVar.c;
                        int i3 = mbpVar.a;
                    }
                }
                throw new NoSuchElementException(a.bE(i, LmJPKwPBa.qPCDeIpiUBKzJh, " not found."));
            }
            mbpVar.b.e(Boolean.valueOf(i2 == 0));
        }
    }
}
