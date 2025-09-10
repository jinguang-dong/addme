package defpackage;

import androidx.wear.ambient.AmbientLifecycleObserverKt;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eel {
    private static final Object a = new Object();
    private static final DocumentBuilderFactory b;

    static {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
        documentBuilderFactoryNewInstance.setIgnoringComments(true);
        try {
            documentBuilderFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (Exception unused) {
        }
        b = documentBuilderFactoryNewInstance;
    }

    private static Document b(InputSource inputSource) throws ParserConfigurationException, edv {
        try {
            DocumentBuilder documentBuilderNewDocumentBuilder = b.newDocumentBuilder();
            documentBuilderNewDocumentBuilder.setErrorHandler(null);
            return documentBuilderNewDocumentBuilder.parse(inputSource);
        } catch (IOException e) {
            throw new edv("Error reading the XML-file", 204, e);
        } catch (ParserConfigurationException e2) {
            throw new edv("XML Parser not correctly configured", 0, e2);
        } catch (SAXException e3) {
            throw new edv("XML parsing failure", 201, e3);
        }
    }

    private static Document c(eea eeaVar, eew eewVar) throws edv {
        try {
            return b(new InputSource(eeaVar.a()));
        } catch (edv e) {
            int i = e.a;
            if (i != 201 && i != 204) {
                throw e;
            }
            if (eewVar.b() && "UTF-8".equals(eeaVar.b())) {
                byte[] bArr = new byte[8];
                eea eeaVar2 = new eea((eeaVar.b * 4) / 3);
                int i2 = 0;
                char c = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = eeaVar.b;
                    if (i2 >= i5) {
                        if (c == 11) {
                            for (int i6 = 0; i6 < i4; i6++) {
                                eeaVar2.c(AmbientLifecycleObserverKt.C(bArr[i6]));
                            }
                        }
                        eeaVar = eeaVar2;
                    } else {
                        if (i2 >= i5) {
                            throw new IndexOutOfBoundsException("The index exceeds the valid buffer area");
                        }
                        byte b2 = eeaVar.a[i2];
                        int i7 = b2 & 255;
                        if (c == 11) {
                            if (i3 <= 0 || (b2 & 192) != 128) {
                                eeaVar2.c(AmbientLifecycleObserverKt.C(bArr[0]));
                                i2 -= i4;
                            } else {
                                int i8 = i4 + 1;
                                bArr[i4] = (byte) i7;
                                i3--;
                                if (i3 == 0) {
                                    eeaVar2.e(bArr, i8);
                                } else {
                                    i4 = i8;
                                }
                            }
                            c = 0;
                            i4 = 0;
                        } else if (i7 < 127) {
                            byte b3 = (byte) i7;
                            eeaVar2.d(eeaVar2.b + 1);
                            byte[] bArr2 = eeaVar2.a;
                            int i9 = eeaVar2.b;
                            eeaVar2.b = i9 + 1;
                            bArr2[i9] = b3;
                        } else if (i7 >= 192) {
                            int i10 = i4 + 1;
                            i3 = -1;
                            for (int i11 = i7; i3 < 8 && (i11 & 128) == 128; i11 += i11) {
                                i3++;
                            }
                            bArr[i4] = (byte) i7;
                            i4 = i10;
                            c = 11;
                        } else {
                            eeaVar2.c(AmbientLifecycleObserverKt.C((byte) i7));
                        }
                        i2++;
                    }
                }
            }
            if (!eewVar.c()) {
                return b(new InputSource(eeaVar.a()));
            }
            try {
                return b(new InputSource(new eec(new InputStreamReader(eeaVar.a(), eeaVar.b()))));
            } catch (UnsupportedEncodingException unused) {
                throw new edv("Unsupported Encoding", 9, e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Object[] d(org.w3c.dom.Node r7, boolean r8, java.lang.Object[] r9) {
        /*
            org.w3c.dom.NodeList r7 = r7.getChildNodes()
            r0 = 0
            r1 = r0
        L6:
            int r2 = r7.getLength()
            if (r1 >= r2) goto L81
            org.w3c.dom.Node r2 = r7.item(r1)
            short r3 = r2.getNodeType()
            r4 = 7
            if (r3 != r4) goto L2a
            r3 = r2
            org.w3c.dom.ProcessingInstruction r3 = (org.w3c.dom.ProcessingInstruction) r3
            java.lang.String r5 = r3.getTarget()
            java.lang.String r6 = "xpacket"
            if (r5 != r6) goto L2a
            r2 = 2
            java.lang.String r3 = r3.getData()
            r9[r2] = r3
            goto L7e
        L2a:
            short r3 = r2.getNodeType()
            r5 = 3
            if (r3 == r5) goto L7e
            short r3 = r2.getNodeType()
            if (r3 == r4) goto L7e
            java.lang.String r3 = r2.getNamespaceURI()
            java.lang.String r4 = r2.getLocalName()
            java.lang.String r5 = "xmpmeta"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L4f
            java.lang.String r5 = "xapmeta"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L57
        L4f:
            java.lang.String r5 = "adobe:ns:meta/"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L79
        L57:
            if (r8 != 0) goto L72
            java.lang.String r5 = "RDF"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L72
            java.lang.String r4 = "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L6a
            goto L72
        L6a:
            r9[r0] = r2
            java.lang.Object r7 = defpackage.eel.a
            r8 = 1
            r9[r8] = r7
            return r9
        L72:
            java.lang.Object[] r2 = d(r2, r8, r9)
            if (r2 == 0) goto L7e
            return r2
        L79:
            java.lang.Object[] r7 = d(r2, r0, r9)
            return r7
        L7e:
            int r1 = r1 + 1
            goto L6
        L81:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eel.d(org.w3c.dom.Node, boolean, java.lang.Object[]):java.lang.Object[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.edw a(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 1037
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eel.a(java.lang.Object):edw");
    }
}
