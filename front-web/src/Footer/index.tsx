import './styles.css';
import { ReactComponent as YouTubeIcone } from './youtube.svg';
import { ReactComponent as LinkedinIcone } from './linkedin.svg';
import { ReactComponent as InstagramIcone } from './instagram.svg';


function Footer(){
    return(
        <footer className="main-footer">
            App desenvolvido durante a 2ª ed. do evento Semana DevSuperior
            <div className="footer-icons">
                <a href="https://www.youtube.com/devsuperior" target="_new">
                    <YouTubeIcone />
                </a>
                <a href="https://www.linkedin.com/school/devsuperior/" target="_new">
                    <LinkedinIcone />
                </a>
                <a href="https://www.instagram.com/devsuperior.ig/" target="_new">
                    <InstagramIcone />
                </a>
            </div>
        </footer>
    )
}

export default Footer;