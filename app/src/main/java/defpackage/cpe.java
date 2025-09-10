package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cpe {
    public cpe(cpp cppVar) {
    }

    public static cxm e(Class cls) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            objNewInstance.getClass();
            return (cxm) objNewInstance;
        } catch (IllegalAccessException e) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e);
        } catch (InstantiationException e2) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e2);
        } catch (NoSuchMethodException e3) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e3);
        }
    }

    public static cxm f(cxp cxpVar, ukx ukxVar, cxy cxyVar) {
        try {
            try {
                return cxpVar.c(ukxVar, cxyVar);
            } catch (AbstractMethodError unused) {
                return cxpVar.b(ske.av(ukxVar), cxyVar);
            }
        } catch (AbstractMethodError unused2) {
            return cxpVar.a(ske.av(ukxVar));
        }
    }

    public cpp a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0082 -> B:24:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0085 -> B:24:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.util.List r6, defpackage.crb r7, defpackage.uhb r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.cqw
            if (r0 == 0) goto L13
            r0 = r8
            cqw r0 = (defpackage.cqw) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cqw r0 = new cqw
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r5 = r0.c
            uhi r8 = defpackage.uhi.a
            int r1 = r0.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L42
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r6 = r0.b
            java.lang.Object r7 = r0.a
            uka r7 = (defpackage.uka) r7
            defpackage.rnt.aN(r5)     // Catch: java.lang.Throwable -> L30
            goto L65
        L30:
            r5 = move-exception
            goto L7e
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            java.lang.Object r6 = r0.a
            java.util.List r6 = (java.util.List) r6
            defpackage.rnt.aN(r5)
            goto L5b
        L42:
            defpackage.rnt.aN(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            cqx r1 = new cqx
            r4 = 0
            r1.<init>(r6, r5, r4)
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r7.a(r1, r0)
            if (r6 == r8) goto L95
            r6 = r5
        L5b:
            uka r5 = new uka
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
            r7 = r5
        L65:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L8b
            java.lang.Object r5 = r6.next()
            uiq r5 = (defpackage.uiq) r5
            r0.a = r7     // Catch: java.lang.Throwable -> L30
            r0.b = r6     // Catch: java.lang.Throwable -> L30
            r0.d = r2     // Catch: java.lang.Throwable -> L30
            java.lang.Object r5 = r5.a(r0)     // Catch: java.lang.Throwable -> L30
            if (r5 != r8) goto L65
            goto L95
        L7e:
            java.lang.Object r1 = r7.a
            if (r1 != 0) goto L85
            r7.a = r5
            goto L65
        L85:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            defpackage.ujk.f(r1, r5)
            goto L65
        L8b:
            java.lang.Object r5 = r7.a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 != 0) goto L94
            ufg r5 = defpackage.ufg.a
            return r5
        L94:
            throw r5
        L95:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpe.d(java.util.List, crb, uhb):java.lang.Object");
    }

    public cpe(byte[] bArr) {
    }

    public cpe() {
        this(new cpp());
    }

    public void b(cmh cmhVar) {
    }

    public void c(cmh cmhVar) {
    }
}
