package defpackage;

import com.google.android.apps.camera.jni.serengeti.SerengetiNative;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acr extends uht implements uiq {
    int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acr(SerengetiNative serengetiNative, uhb uhbVar, int i) {
        super(1, uhbVar);
        this.c = i;
        this.b = serengetiNative;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, uiq] */
    @Override // defpackage.uiq
    public final /* synthetic */ Object a(Object obj) {
        int i = this.c;
        if (i == 0) {
            return new acr((uiq) this.b, (uhb) obj, 0).b(ufg.a);
        }
        if (i == 1) {
            return new acr((sq) this.b, (uhb) obj, 1).b(ufg.a);
        }
        if (i == 2) {
            return new acr((cqv) null, (uhb) obj, 2).b(ufg.a);
        }
        if (i != 3) {
            return new acr((SerengetiNative) this.b, (uhb) obj, 4).b(ufg.a);
        }
        return new acr(this.b, (uhb) obj, 3, null).b(ufg.a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, uiq] */
    @Override // defpackage.uhn
    public final Object b(Object obj) throws Throwable {
        int i = this.c;
        if (i == 0) {
            uhi uhiVar = uhi.a;
            if (this.a != 0) {
                rnt.aN(obj);
                return obj;
            }
            rnt.aN(obj);
            ?? r6 = this.b;
            this.a = 1;
            Object objO = bay.o(r6, this);
            return objO == uhiVar ? uhiVar : objO;
        }
        if (i == 1) {
            uhi uhiVar2 = uhi.a;
            if (this.a != 0) {
                rnt.aN(obj);
            } else {
                rnt.aN(obj);
                Object obj2 = this.b;
                this.a = 1;
                Object objZ = ((sq) obj2).f.z(this);
                if (objZ != uhiVar2) {
                    objZ = ufg.a;
                }
                if (objZ == uhiVar2) {
                    return uhiVar2;
                }
            }
            return ufg.a;
        }
        if (i == 2) {
            if (this.a != 0) {
                rnt.aN(obj);
                return ufg.a;
            }
            rnt.aN(obj);
            this.a = 1;
            throw null;
        }
        if (i == 3) {
            uhi uhiVar3 = uhi.a;
            if (this.a != 0) {
                rnt.aN(obj);
                return obj;
            }
            rnt.aN(obj);
            ?? r62 = this.b;
            this.a = 1;
            Object objA = r62.a(this);
            return objA == uhiVar3 ? uhiVar3 : objA;
        }
        uhi uhiVar4 = uhi.a;
        int i2 = this.a;
        rnt.aN(obj);
        if (i2 == 0) {
            SerengetiNative serengetiNative = (SerengetiNative) this.b;
            vl vlVar = new vl(serengetiNative, (uhb) null, 15);
            this.a = 1;
            if (ung.s(serengetiNative.b, vlVar, this) == uhiVar4) {
                return uhiVar4;
            }
        }
        return ufg.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acr(cqv cqvVar, uhb uhbVar, int i) {
        super(1, uhbVar);
        this.c = i;
        this.b = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acr(sq sqVar, uhb uhbVar, int i) {
        super(1, uhbVar);
        this.c = i;
        this.b = sqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acr(uiq uiqVar, uhb uhbVar, int i) {
        super(1, uhbVar);
        this.c = i;
        this.b = uiqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acr(uiq uiqVar, uhb uhbVar, int i, byte[] bArr) {
        super(1, uhbVar);
        this.c = i;
        this.b = uiqVar;
    }
}
