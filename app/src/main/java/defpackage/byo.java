package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class byo extends uht implements uiu {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byo(uhb uhbVar, int i) {
        super(2, uhbVar);
        this.a = i;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            return new byo((uhb) obj2, 0).b(ufg.a);
        }
        if (i != 1) {
            return new byo((uhb) obj2, 2, (char[]) null).b(ufg.a);
        }
        return new byo((uhb) obj2, 1, (byte[]) null).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        int i = this.a;
        if (i == 0) {
            rnt.aN(obj);
            return Choreographer.getInstance();
        }
        if (i != 1) {
            rnt.aN(obj);
            return ufg.a;
        }
        rnt.aN(obj);
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? new byo(uhbVar, 2, (char[]) null) : new byo(uhbVar, 1, (byte[]) null) : new byo(uhbVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byo(uhb uhbVar, int i, byte[] bArr) {
        super(2, uhbVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byo(uhb uhbVar, int i, char[] cArr) {
        super(2, uhbVar);
        this.a = i;
    }
}
