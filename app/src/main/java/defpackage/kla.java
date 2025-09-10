package defpackage;

import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kla implements kle {
    private final kle a;
    private final syu b;
    private final hty c;
    private final hbp d;

    public kla(kle kleVar, syu syuVar, hty htyVar, hbp hbpVar) {
        this.a = kleVar;
        this.b = syuVar;
        this.c = htyVar;
        this.d = hbpVar;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.b.c(new kdx(this.c, 7), sxo.a);
        this.a.close();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.kle
    public final void a(poj pojVar, syu syuVar) {
        hty htyVar = this.c;
        Object obj = htyVar.b;
        Object obj2 = ((hbp) obj).b;
        long jD = pojVar.d();
        synchronized (obj2) {
            Object obj3 = htyVar.a;
            Set set = ((klc) obj3).d;
            Long lValueOf = Long.valueOf(jD);
            set.add(lValueOf);
            ((hbp) obj).a.put(lValueOf, obj3);
        }
        if (Arrays.asList(37, 38, 32).contains(Integer.valueOf(pojVar.a()))) {
            pkf pkfVar = new pkf(pojVar, 2);
            hbp hbpVar = this.d;
            kiy kiyVar = new kiy(new pkg(pkfVar), syuVar);
            synchronized (hbpVar.b) {
                long jD2 = kiyVar.d();
                klc klcVarG = hbpVar.g(jD2);
                Map map = klcVarG.b;
                Long lValueOf2 = Long.valueOf(jD2);
                rnt.M(!map.containsKey(lValueOf2), KsvNaXS.hSfkotlUPp);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    jsv.l(kiyVar);
                    klcVarG.b.put(lValueOf2, byteArrayOutputStream.toByteArray());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            this.a.a(new pkg(pkfVar), syuVar);
        } else if (pojVar.a() == 35) {
            pkf pkfVar2 = new pkf(pojVar, 2);
            hbp hbpVar2 = this.d;
            kiy kiyVar2 = new kiy(new pkg(pkfVar2), syuVar);
            synchronized (hbpVar2.b) {
                long jD3 = kiyVar2.d();
                klc klcVarG2 = hbpVar2.g(jD3);
                Map map2 = klcVarG2.a;
                Long lValueOf3 = Long.valueOf(jD3);
                rnt.M(!map2.containsKey(lValueOf3), "Image already added");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    jsv.l(kiyVar2);
                    klcVarG2.a.put(lValueOf3, byteArrayOutputStream2.toByteArray());
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.a.a(new pkg(pkfVar2), syuVar);
        } else {
            this.a.a(pojVar, syuVar);
        }
        hbp hbpVar3 = this.d;
        long jD4 = pojVar.d();
        synchronized (hbpVar3.b) {
            hbpVar3.g(jD4).c.put(Long.valueOf(jD4), syuVar);
        }
    }
}
