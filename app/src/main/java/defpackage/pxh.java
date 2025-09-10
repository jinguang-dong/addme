package defpackage;

import android.net.Uri;
import java.net.MalformedURLException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pxh implements pxf {
    private final sbv a;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public pxh(qaq qaqVar) {
        this.a = sbv.m(qaqVar.a);
    }

    @Override // defpackage.pxf
    public final syu a(pxe pxeVar) {
        try {
            return b(pxeVar.b).a(pxeVar);
        } catch (pul e) {
            return ske.L(e);
        }
    }

    final pxf b(String str) throws MalformedURLException, pul {
        try {
            Uri uri = Uri.parse(str);
            if (uri == null) {
                throw new MalformedURLException("Could not parse URL.");
            }
            String scheme = uri.getScheme();
            if (scheme == null) {
                throw new MalformedURLException("URL contained no scheme.");
            }
            pxf pxfVar = (pxf) this.a.get(scheme);
            if (pxfVar != null) {
                return pxfVar;
            }
            qbu.d("%s: No registered downloader supports the download url scheme, scheme = %s", "MultiSchemeFileDownloader", scheme);
            tfm tfmVarA = pul.a();
            tfmVarA.b = puk.UNSUPPORTED_DOWNLOAD_URL_SCHEME;
            throw tfmVarA.c();
        } catch (MalformedURLException e) {
            qbu.d("%s: The download url is malformed, url = %s", "MultiSchemeFileDownloader", str);
            tfm tfmVarA2 = pul.a();
            tfmVarA2.b = puk.MALFORMED_DOWNLOAD_URL;
            tfmVarA2.d = e;
            throw tfmVarA2.c();
        }
    }
}
