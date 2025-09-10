package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahr extends uht implements uiu {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahr(long j, tm tmVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.b = j;
        this.c = tmVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.e;
        if (i == 0) {
            return ((ahr) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i != 1) {
            return ((ahr) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((ahr) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) throws Exception {
        int i = this.e;
        if (i == 0) {
            uhi uhiVar = uhi.a;
            if (this.a != 0) {
                rnt.aN(obj);
            } else {
                rnt.aN(obj);
                und undVar = (und) this.d;
                Object obj2 = this.c;
                long j = this.b;
                uiv uivVar = ((ahs) obj2).j;
                bkf bkfVar = new bkf(j);
                this.a = 1;
                if (uivVar.a(undVar, bkfVar, this) == uhiVar) {
                    return uhiVar;
                }
            }
            return ufg.a;
        }
        if (i == 1) {
            uhi uhiVar2 = uhi.a;
            if (this.a != 0) {
                rnt.aN(obj);
            } else {
                rnt.aN(obj);
                und undVar2 = (und) this.d;
                long j2 = this.b;
                Objects.toString(undVar2);
                this.a = 1;
                if (ung.e(j2, this) == uhiVar2) {
                    return uhiVar2;
                }
            }
            ((tm) this.c).d(0L);
            return ufg.a;
        }
        uhi uhiVar3 = uhi.a;
        int i2 = this.a;
        rnt.aN(obj);
        if (i2 == 0) {
            und undVar3 = (und) this.d;
            Object obj3 = this.c;
            long j3 = this.b;
            ahs ahsVar = (ahs) obj3;
            uiv uivVar2 = ahsVar.k;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
            long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2);
            aii aiiVar = ahsVar.h;
            uiv uivVar3 = ahp.a;
            long j4 = (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32);
            Float f = new Float(aiiVar == aii.a ? Float.intBitsToFloat((int) (j4 & 4294967295L)) : Float.intBitsToFloat((int) (j4 >> 32)));
            this.a = 1;
            if (uivVar2.a(undVar3, f, this) == uhiVar3) {
                return uhiVar3;
            }
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        int i = this.e;
        if (i == 0) {
            ahr ahrVar = new ahr((ahs) this.c, this.b, uhbVar, 0);
            ahrVar.d = obj;
            return ahrVar;
        }
        if (i == 1) {
            ahr ahrVar2 = new ahr(this.b, (tm) this.c, uhbVar, 1);
            ahrVar2.d = obj;
            return ahrVar2;
        }
        ahr ahrVar3 = new ahr((ahs) this.c, this.b, uhbVar, 2, null);
        ahrVar3.d = obj;
        return ahrVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahr(ahs ahsVar, long j, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.c = ahsVar;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahr(ahs ahsVar, long j, uhb uhbVar, int i, byte[] bArr) {
        super(2, uhbVar);
        this.e = i;
        this.c = ahsVar;
        this.b = j;
    }
}
