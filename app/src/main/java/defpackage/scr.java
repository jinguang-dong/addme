package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class scr extends sbu {
    private static final long serialVersionUID = 0;
    private final Comparator a;

    public scr(scs scsVar) {
        super(scsVar);
        this.a = scsVar.comparator();
    }

    @Override // defpackage.sbu
    public final /* bridge */ /* synthetic */ sbr a(int i) {
        return new scq(this.a);
    }
}
