package defpackage;

import android.opengl.Matrix;
import com.google.android.material.button.xlT.JvFFEwFNdCrxf;
import com.google.googlex.gcam.ShotMetadata;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class flb implements Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ flb(fip fipVar, fig figVar, fjk fjkVar, Optional optional, int i) {
        this.e = i;
        this.d = fipVar;
        this.a = figVar;
        this.c = fjkVar;
        this.b = optional;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.e;
        return i != 0 ? i != 1 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ flb(fld fldVar, float[] fArr, qjn qjnVar, qim qimVar, int i) {
        this.e = i;
        this.a = fldVar;
        this.b = fArr;
        this.c = qjnVar;
        this.d = qimVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, qin] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) {
        int i;
        List list;
        List list2;
        int i2 = this.e;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                fjj fjjVar = new fjj((fjk) this.c);
                fjjVar.a = new ShotMetadata((ShotMetadata) ((Optional) this.b).get());
                fjjVar.c(((tee) obj).a);
                fjjVar.b(false);
                fip fipVar = (fip) this.d;
                fjjVar.f = fipVar.m.b("jpg");
                fjjVar.g = fipVar.l(3, 3);
                ((fig) this.a).g(fjjVar.a());
                return;
            }
            hxn hxnVar = (hxn) this.a;
            boolean z = hxnVar.a;
            ibl iblVar = (ibl) obj;
            Object obj2 = this.d;
            Object obj3 = this.b;
            Object obj4 = this.c;
            if (z) {
                hxnVar.c.c.b("Sending primary RAW for processing.");
                if (obj2 != null) {
                    list2 = ((iby) obj2).c;
                } else {
                    int i4 = sbp.d;
                    list2 = sex.a;
                    obj2 = null;
                }
                iblVar.b((tcu) obj4, (ShotMetadata) obj3, list2, obj2 != null ? ((iby) obj2).b() : null);
                return;
            }
            hxnVar.c.c.b("Sending secondary RAW for processing.");
            if (obj2 != null) {
                list = ((iby) obj2).c;
            } else {
                int i5 = sbp.d;
                list = sex.a;
                obj2 = null;
            }
            iblVar.e((tcu) obj4, (ShotMetadata) obj3, list, obj2 != null ? ((iby) obj2).b() : null);
            return;
        }
        fnm fnmVar = (fnm) obj;
        fnp fnpVarD = fnmVar.d();
        Object obj5 = this.a;
        fld fldVar = (fld) obj5;
        float[] fArr = fldVar.d;
        fnpVarD.o(fArr);
        fnp fnpVarD2 = fnmVar.d();
        float[] fArr2 = fldVar.g;
        fnpVarD2.n(fArr2);
        float fHashCode = fnmVar.hashCode();
        float f = fld.b * 10.0f;
        double d = fHashCode * 0.144f;
        float fCos = (float) Math.cos(d);
        float[] fArr3 = fldVar.f;
        fArr3[0] = fCos * 10.0f;
        fArr3[1] = (-((float) Math.sin(d))) * f;
        fArr3[2] = ((float) Math.sin(d)) * 10.0f;
        fArr3[3] = ((float) Math.cos(d)) * f;
        float[] fArr4 = fldVar.e;
        Matrix.multiplyMM(fArr4, 0, (float[]) this.b, 0, fArr, 0);
        float fA = fnmVar.a();
        float fB = fnmVar.b();
        flc flcVar = new flc(fnmVar.f(), Math.max((fA - 0.5f) / fA, 0.0f), Math.max(((-0.5f) + fB) / fB, 0.0f));
        int iLimit = fnmVar.f().limit() / 2;
        int i6 = iLimit - 1;
        ShortBuffer shortBufferAllocate = ShortBuffer.allocate(iLimit * 3);
        shortBufferAllocate.put((short) (i6 + i6));
        Object obj6 = this.d;
        Object obj7 = this.c;
        int i7 = 0;
        while (i7 < iLimit) {
            int i8 = i3;
            int i9 = i7 + i7;
            shortBufferAllocate.put((short) i9);
            shortBufferAllocate.put((short) (i9 + 1));
            i7++;
            i3 = i8;
        }
        int i10 = i3;
        shortBufferAllocate.put((short) 1);
        int i11 = 1;
        while (true) {
            i = iLimit / 2;
            if (i11 >= i) {
                break;
            }
            int i12 = i6 - i11;
            shortBufferAllocate.put((short) (i12 + i12 + 1));
            shortBufferAllocate.put((short) (i11 + i11 + 1));
            i11++;
        }
        if (iLimit % 2 != 0) {
            shortBufferAllocate.put((short) (i + i + 1));
        }
        obu obuVar = fldVar.i;
        int i13 = flcVar.c;
        int i14 = flcVar.e;
        qhi[] qhiVarArr = new qhi[1];
        qhiVarArr[i10] = flcVar.d;
        int[] iArr = {i14};
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(((i14 * 32) * i13) / 8).order(ByteOrder.nativeOrder());
        for (int i15 = i10; i15 < i13; i15++) {
            flcVar.a(i15, byteBufferOrder);
        }
        ?? r1 = obuVar.b;
        byteBufferOrder.rewind();
        qkr qkrVar = new qkr(qif.b(r1, 34962, byteBufferOrder), qhiVarArr, iArr, i13);
        try {
            qju qjuVarB = qju.b(r1, shortBufferAllocate.array());
            try {
                a.I(qjuVarB.b >= 3 ? 1 : i10);
                qji qjiVarA = new tym(5, qkrVar, qjuVarB).a(((fld) obj5).h);
                qjiVarA.c("a_XZPositionAlpha", i10);
                float[] fArr5 = fld.a;
                qjiVarA.j("u_GridControl", fArr5[i10], fArr5[1], fArr5[2], fArr5[3]);
                qjiVarA.e("u_Texture", ((fld) obj5).c);
                qjiVarA.g("u_Model", (float[]) fArr.clone());
                qjiVarA.g("u_ModelViewProjection", (float[]) fArr4.clone());
                qjiVarA.e.put("u_PlaneUvMatrix", new qje((float[]) fArr3.clone(), 0));
                qjiVarA.i(JvFFEwFNdCrxf.lhEgDAxneih, fArr2[0], fArr2[1], fArr2[2]);
                qjiVarA.d("u_ExternalTex", (qjn) obj7);
                qjiVarA.h("u_ExternalTexSize", ((qhx) ((qjn) obj7).c()).a.b(), ((qhx) ((qjn) obj7).c()).a.a());
                qjiVarA.a((qim) obj6);
                qjuVarB.close();
                qkrVar.close();
            } finally {
            }
        } finally {
        }
    }

    public /* synthetic */ flb(hxn hxnVar, tcu tcuVar, ShotMetadata shotMetadata, iby ibyVar, int i) {
        this.e = i;
        this.a = hxnVar;
        this.c = tcuVar;
        this.b = shotMetadata;
        this.d = ibyVar;
    }
}
