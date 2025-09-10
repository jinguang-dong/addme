package defpackage;

import com.google.android.apps.camera.jni.serengeti.SerengetiNative;
import java.util.Objects;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vl extends uht implements uiu {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(aen aenVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.b = i;
        this.a = aenVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((vl) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 1:
                return ((vl) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 2:
                return ((vl) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 3:
                return ((vl) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 4:
                return ((vl) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 5:
                return ((vl) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 6:
                return ((vl) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 7:
                return ((vl) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 8:
                return ((vl) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 9:
                return ((vl) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 10:
                return ((vl) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 11:
                return ((vl) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 12:
                return ((vl) c((cpo) obj, (uhb) obj2)).b(ufg.a);
            case 13:
                return ((vl) c((und) obj, (uhb) obj2)).b(ufg.a);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((vl) c((und) obj, (uhb) obj2)).b(ufg.a);
            default:
                return ((vl) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
    }

    /* JADX WARN: Type inference failed for: r7v39, types: [azr, java.lang.Object] */
    @Override // defpackage.uhn
    public final Object b(Object obj) {
        int i = 0;
        switch (this.b) {
            case 0:
                rnt.aN(obj);
                ((vm) this.a).a.a();
                break;
            case 1:
                rnt.aN(obj);
                ((tm) this.a).c(true);
                break;
            case 2:
                rnt.aN(obj);
                Object obj2 = this.a;
                aen aenVar = (aen) obj2;
                if (aenVar.e == null) {
                    ajz ajzVar = new ajz();
                    ocq ocqVar = aenVar.h;
                    if (ocqVar != null) {
                        ukc.C(((bij) obj2).C(), null, 0, new aej(ocqVar, ajzVar, (uhb) null, 0), 3);
                    }
                    aenVar.e = ajzVar;
                }
                break;
            case 3:
                rnt.aN(obj);
                Object obj3 = this.a;
                aen aenVar2 = (aen) obj3;
                ajz ajzVar2 = aenVar2.e;
                if (ajzVar2 != null) {
                    aka akaVar = new aka(ajzVar2);
                    ocq ocqVar2 = aenVar2.h;
                    if (ocqVar2 != null) {
                        ukc.C(((bij) obj3).C(), null, 0, new aej(ocqVar2, akaVar, (uhb) null, 2), 3);
                    }
                    aenVar2.e = null;
                }
                break;
            case 4:
                rnt.aN(obj);
                ((ail) this.a).n();
                break;
            case 5:
                rnt.aN(obj);
                ((ail) this.a).o();
                break;
            case 6:
                rnt.aN(obj);
                ((ail) this.a).o();
                break;
            case 7:
                rnt.aN(obj);
                ((ail) this.a).n();
                break;
            case 8:
                rnt.aN(obj);
                ((ail) this.a).o();
                break;
            case 9:
                rnt.aN(obj);
                ((ail) this.a).o();
                break;
            case 10:
                rnt.aN(obj);
                ((ail) this.a).n();
                break;
            case 11:
                rnt.aN(obj);
                ((tdy) this.a).a.b(new dqq(i));
                break;
            case 12:
                rnt.aN(obj);
                String str = eds.a;
                dwj.b();
                Objects.toString(this.a);
                break;
            case 13:
                rnt.aN(obj);
                fxa fxaVar = (fxa) this.a;
                Object obj4 = fxaVar.e.b.get(0);
                obj4.getClass();
                int iA = ((gbt) obj4).a();
                gdm gdmVar = fxaVar.b;
                gdmVar.d(iA);
                gdmVar.g(fxaVar.f.c);
                gdmVar.h();
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                rnt.aN(obj);
                ((fxa) this.a).b.i();
                break;
            default:
                rnt.aN(obj);
                paw.a(SerengetiNative.class, "gcastartup");
                SerengetiNative.nativeInitialize(((SerengetiNative) this.a).a);
                break;
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        switch (this.b) {
            case 0:
                return new vl((vm) this.a, uhbVar, 0);
            case 1:
                return new vl((tm) this.a, uhbVar, 1);
            case 2:
                return new vl((aen) this.a, uhbVar, 2);
            case 3:
                return new vl((aen) this.a, uhbVar, 3, (byte[]) null);
            case 4:
                return new vl((ail) this.a, uhbVar, 4);
            case 5:
                return new vl((ail) this.a, uhbVar, 5, (byte[]) null);
            case 6:
                return new vl((ail) this.a, uhbVar, 6, (char[]) null);
            case 7:
                return new vl((ail) this.a, uhbVar, 7, (short[]) null);
            case 8:
                return new vl((ail) this.a, uhbVar, 8, (int[]) null);
            case 9:
                return new vl((ail) this.a, uhbVar, 9, (boolean[]) null);
            case 10:
                return new vl((ail) this.a, uhbVar, 10, (float[]) null);
            case 11:
                return new vl((tdy) this.a, uhbVar, 11);
            case 12:
                return new vl((ebx) this.a, uhbVar, 12);
            case 13:
                return new vl((fxa) this.a, uhbVar, 13);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new vl((fxa) this.a, uhbVar, 14, (byte[]) null);
            default:
                return new vl((SerengetiNative) this.a, uhbVar, 15);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(aen aenVar, uhb uhbVar, int i, byte[] bArr) {
        super(2, uhbVar);
        this.b = i;
        this.a = aenVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(ail ailVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.b = i;
        this.a = ailVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(ail ailVar, uhb uhbVar, int i, byte[] bArr) {
        super(2, uhbVar);
        this.b = i;
        this.a = ailVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(ail ailVar, uhb uhbVar, int i, char[] cArr) {
        super(2, uhbVar);
        this.b = i;
        this.a = ailVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(ail ailVar, uhb uhbVar, int i, float[] fArr) {
        super(2, uhbVar);
        this.b = i;
        this.a = ailVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(ail ailVar, uhb uhbVar, int i, int[] iArr) {
        super(2, uhbVar);
        this.b = i;
        this.a = ailVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(ail ailVar, uhb uhbVar, int i, short[] sArr) {
        super(2, uhbVar);
        this.b = i;
        this.a = ailVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(ail ailVar, uhb uhbVar, int i, boolean[] zArr) {
        super(2, uhbVar);
        this.b = i;
        this.a = ailVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(SerengetiNative serengetiNative, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.b = i;
        this.a = serengetiNative;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(ebx ebxVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.b = i;
        this.a = ebxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(fxa fxaVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.b = i;
        this.a = fxaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(fxa fxaVar, uhb uhbVar, int i, byte[] bArr) {
        super(2, uhbVar);
        this.b = i;
        this.a = fxaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(tdy tdyVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.b = i;
        this.a = tdyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(tm tmVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.b = i;
        this.a = tmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(vm vmVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.b = i;
        this.a = vmVar;
    }
}
