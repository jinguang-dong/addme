package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ay implements DialogInterface.OnCancelListener {
    final /* synthetic */ bb a;

    public ay(bb bbVar) {
        this.a = bbVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        bb bbVar = this.a;
        Dialog dialog = bbVar.c;
        if (dialog != null) {
            bbVar.onCancel(dialog);
        }
    }
}
