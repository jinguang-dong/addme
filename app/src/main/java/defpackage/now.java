package defpackage;

import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class now implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public now(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (this.b == 0) {
            if (z) {
                ((nox) this.a).c.d.seekTo(i);
                return;
            }
            return;
        }
        if (z) {
            SeekBarPreference seekBarPreference = (SeekBarPreference) this.a;
            if (seekBarPreference.f || !seekBarPreference.c) {
                seekBarPreference.k(seekBar);
                return;
            }
        }
        SeekBarPreference seekBarPreference2 = (SeekBarPreference) this.a;
        seekBarPreference2.l(i + seekBarPreference2.b);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            ((SeekBarPreference) obj).c = true;
        } else {
            ((nox) obj).c.c();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        if (this.b == 0) {
            ((nox) this.a).c.d();
            return;
        }
        SeekBarPreference seekBarPreference = (SeekBarPreference) this.a;
        seekBarPreference.c = false;
        if (seekBar.getProgress() + seekBarPreference.b != seekBarPreference.a) {
            seekBarPreference.k(seekBar);
        }
    }
}
