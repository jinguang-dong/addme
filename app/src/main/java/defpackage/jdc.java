package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jdc implements DialogInterface.OnClickListener {
    private final /* synthetic */ int a;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        if (i2 == 0) {
            int i3 = jde.c;
        } else if (i2 == 1) {
            dialogInterface.dismiss();
        } else {
            if (i2 != 2) {
                return;
            }
            dialogInterface.dismiss();
        }
    }
}
