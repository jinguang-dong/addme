package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dai implements DialogInterface.OnMultiChoiceClickListener {
    final /* synthetic */ daj a;

    public dai(daj dajVar) {
        this.a = dajVar;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        daj dajVar = this.a;
        boolean z2 = dajVar.ah;
        if (z) {
            dajVar.ah = z2 | dajVar.ag.add(dajVar.aj[i].toString());
        } else {
            dajVar.ah = z2 | dajVar.ag.remove(dajVar.aj[i].toString());
        }
    }
}
