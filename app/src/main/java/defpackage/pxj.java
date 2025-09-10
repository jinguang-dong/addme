package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pxj implements pxf {
    public final lat a;
    private final Executor b;

    public pxj(lat latVar, Executor executor) {
        this.a = latVar;
        this.b = executor;
    }

    @Override // defpackage.pxf
    public final syu a(pxe pxeVar) {
        String str = pxeVar.b;
        if (str.startsWith("inlinefile")) {
            return qsz.l(new qcp(this, (pxg) pxeVar.f.c(), pxeVar, 1), this.b);
        }
        qbu.d("%s: Invalid url given, expected to start with 'inlinefile:', but was %s", "InlineFileDownloader", str);
        tfm tfmVarA = pul.a();
        tfmVarA.b = puk.INVALID_INLINE_FILE_URL_SCHEME;
        tfmVarA.c = "InlineFileDownloader only supports copying inlinefile: scheme";
        return ske.L(tfmVarA.c());
    }
}
