package defpackage;

import android.content.res.Resources;
import android.widget.SeekBar;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mti implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ mtm a;

    public mti(mtm mtmVar) {
        this.a = mtmVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) throws Resources.NotFoundException {
        mtm mtmVar = this.a;
        if (mtmVar.k.g(i)) {
            mtmVar.s(false);
            if (mtmVar.t()) {
                mtmVar.o.h(mtmVar.k.getContentDescription());
            }
        }
        if (z) {
            double dC = mtmVar.k.c();
            if (!mtmVar.k.g(i)) {
                mtmVar.k.setProgress((int) dC);
                return;
            }
            double d = i;
            mtmVar.k.e(d);
            mtmVar.j.n(mtmVar.k.a(d));
            if (dC != d) {
                mtmVar.h(mtm.y(i));
            }
            mtmVar.j();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
