package defpackage;

import androidx.wear.ambient.SharedLibraryVersion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dma extends uht implements uiu {
    int a;
    final /* synthetic */ dme b;
    final /* synthetic */ int c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dma(dme dmeVar, int i, uhb uhbVar) {
        super(2, uhbVar);
        this.b = dmeVar;
        this.c = i;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dma) c((aim) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i == 0) {
            aim aimVar = (aim) this.d;
            dme dmeVar = this.b;
            dlw dlwVar = new dlw(dmeVar, aimVar);
            int i2 = this.c;
            chq chqVar = ((dlq) dmeVar.a.a()).h;
            this.a = 1;
            if (SharedLibraryVersion.c(dlwVar, i2, chqVar, aimVar, this) == uhiVar) {
                return uhiVar;
            }
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        dma dmaVar = new dma(this.b, this.c, uhbVar);
        dmaVar.d = obj;
        return dmaVar;
    }
}
