package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abp extends uht implements uiq {
    Object a;
    Object b;
    int c;
    final /* synthetic */ abr d;
    final /* synthetic */ Object e;
    final /* synthetic */ abv f;
    final /* synthetic */ long g;
    final /* synthetic */ uiq h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abp(abr abrVar, Object obj, abv abvVar, long j, uiq uiqVar, uhb uhbVar) {
        super(1, uhbVar);
        this.d = abrVar;
        this.e = obj;
        this.f = abvVar;
        this.g = j;
        this.h = uiqVar;
    }

    @Override // defpackage.uiq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new abp(this.d, this.e, this.f, this.g, this.h, (uhb) obj).b(ufg.a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, uiq] */
    @Override // defpackage.uhn
    public final Object b(Object obj) {
        abp abpVar;
        Object obj2;
        Object obj3;
        CancellationException cancellationException;
        uhi uhiVar = uhi.a;
        if (this.c != 0) {
            obj2 = this.b;
            obj3 = this.a;
            try {
                rnt.aN(obj);
                abpVar = this;
            } catch (CancellationException e) {
                cancellationException = e;
                abpVar = this;
                abpVar.d.g();
                throw cancellationException;
            }
        } else {
            rnt.aN(obj);
            try {
                abr abrVar = this.d;
                abz abzVar = abrVar.a;
                abzVar.a = (ace) abrVar.b.a.a(this.e);
                abv abvVar = this.f;
                abrVar.i(((adf) abvVar).a);
                abrVar.h(true);
                abz abzVar2 = new abz(abzVar.e, abzVar.a(), byi.bc(abzVar.a), abzVar.b, Long.MIN_VALUE, abzVar.d);
                ujw ujwVar = new ujw();
                long j = this.g;
                aok aokVar = new aok(abrVar, abzVar2, this.h, ujwVar, 1);
                this.a = abzVar2;
                this.b = ujwVar;
                this.c = 1;
                abpVar = this;
                try {
                    if (byi.aW(abzVar2, abvVar, j, aokVar, abpVar) == uhiVar) {
                        return uhiVar;
                    }
                    obj2 = ujwVar;
                    obj3 = abzVar2;
                } catch (CancellationException e2) {
                    e = e2;
                    cancellationException = e;
                    abpVar.d.g();
                    throw cancellationException;
                }
            } catch (CancellationException e3) {
                e = e3;
                abpVar = this;
                cancellationException = e;
                abpVar.d.g();
                throw cancellationException;
            }
        }
        int i = true != ((ujw) obj2).a ? 2 : 1;
        abpVar.d.g();
        return new abw((abz) obj3, i);
    }
}
