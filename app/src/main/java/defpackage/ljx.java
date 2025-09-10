package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ljx implements BiConsumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ljx(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.function.BiPredicate] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, owq] */
    @Override // java.util.function.BiConsumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void accept(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            int r0 = r5.c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L46
            if (r0 == r1) goto L1c
            sbr r6 = (defpackage.sbr) r6
            j$.util.stream.Collector r0 = defpackage.ryv.a
            java.lang.Object r0 = r5.a
            java.lang.Object r0 = r0.apply(r7)
            java.lang.Object r5 = r5.b
            java.lang.Object r5 = r5.apply(r7)
            r6.f(r0, r5)
            return
        L1c:
            kqy r6 = (defpackage.kqy) r6
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            sgv r0 = defpackage.ktb.a
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L3f
            java.lang.Object r7 = r5.a
            ksa r0 = defpackage.ksa.PHOTO_FLASH_ON
            java.lang.Object r7 = r7.dL()
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L3f
            java.lang.Object r5 = r5.b
            boolean r5 = r5.test(r6, r0)
            if (r5 == 0) goto L3f
            goto L40
        L3f:
            r1 = r2
        L40:
            kta r5 = defpackage.kta.FLASH_ON
            r6.f(r1, r5)
            return
        L46:
            java.lang.Object r0 = r5.b
            lkk r6 = (defpackage.lkk) r6
            ljz r7 = (defpackage.ljz) r7
            android.view.View r3 = r7.a
            if (r6 != r0) goto L51
            goto L52
        L51:
            r1 = r2
        L52:
            if (r1 == 0) goto L58
            r4 = 2131231761(0x7f080411, float:1.8079612E38)
            goto L5b
        L58:
            r4 = 2131231762(0x7f080412, float:1.8079614E38)
        L5b:
            java.lang.Object r5 = r5.a
            lka r5 = (defpackage.lka) r5
            android.content.Context r5 = r5.f
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r4)
            r3.setBackground(r5)
            android.widget.TextView r5 = r7.b
            if (r1 == 0) goto L74
            r1 = 2130968989(0x7f04019d, float:1.7546647E38)
            int r1 = defpackage.qpt.P(r5, r1)
            goto L78
        L74:
            int r1 = defpackage.ojl.aL(r5)
        L78:
            r5.setTextColor(r1)
            java.lang.String r1 = r7.c
            r5.setText(r1)
            android.view.View r5 = r7.d
            if (r6 != r0) goto L85
            goto L87
        L85:
            r2 = 8
        L87:
            r5.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ljx.accept(java.lang.Object, java.lang.Object):void");
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i = this.c;
        return i != 0 ? i != 1 ? BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
